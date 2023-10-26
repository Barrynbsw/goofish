package com.example.backened.controller;

import com.example.backened.common.result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

@RestController
@RequestMapping("/common")

public class CommonController {
    private String basepath= "F:\\software engineer\\Projects\\goofish\\goofish\\vue\\src\\assets\\";
    @PostMapping("/upload")
    public result upload(MultipartFile file){
    String originaFilename=file.getOriginalFilename();
    String tail=originaFilename.substring(originaFilename.lastIndexOf('.'));
    Date date=new Date();
    String filename=date.toString()+tail;
        try {
            file.transferTo(new File(basepath+filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    return  result.success(filename);
    }
    @GetMapping("/download")
    public void download(String filename, HttpServletResponse response) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("F:\\software engineer\\Projects\\goofish\\goofish\\vue\\src\\assets\\"+filename));
        javax.servlet.ServletOutputStream outputStream = response.getOutputStream();
        response.setContentType("image/jpeg");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fileInputStream.read(bytes)) != -1){
            outputStream.write(bytes,0,len);
            outputStream.flush();
        }
        outputStream.close();
        fileInputStream.close();
    }


}
