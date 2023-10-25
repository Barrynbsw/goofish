package com.example.backened.controller;

import com.example.backened.common.result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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


}
