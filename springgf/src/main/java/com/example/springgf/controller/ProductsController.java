package com.example.springgf.controller;

import com.example.springgf.common.result;
import com.example.springgf.controller.request.productrequest;
import com.example.springgf.entity.products;
import com.example.springgf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductsController {
@Autowired
ProductService productService;
@GetMapping("/add")
    public result add(HttpServletRequest r, products p,String catename){
    productService.add(r,p,catename);
    return result.success();
}
@GetMapping("/guess")
    public  result guess(){
    List<productrequest> res=productService.guess();
    return result.success(res);
}

}
