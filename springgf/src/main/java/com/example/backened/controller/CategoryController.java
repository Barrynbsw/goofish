package com.example.backened.controller;

import com.example.backened.common.result;
import com.example.backened.controller.request.categoryrequest;
import com.example.backened.service.CategoryService;
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
    @GetMapping("catepage")
    public result catepage(){
      List<categoryrequest> r=categoryService.catepage();
        return result.success(r);
    }
}
