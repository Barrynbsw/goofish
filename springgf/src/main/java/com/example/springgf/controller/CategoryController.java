package com.example.springgf.controller;


import com.example.springgf.common.result;
import com.example.springgf.controller.request.categoryrequest;
import com.example.springgf.entity.categories;
import com.example.springgf.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @GetMapping("/catepage")
    public result catepage(){
      List<categoryrequest> r=categoryService.catepage();
        return result.success(r);
    }
    @GetMapping("/list")
    public result list(){
        List<categories> categories=categoryService.list();
        return result.success(categories);
    }
}
