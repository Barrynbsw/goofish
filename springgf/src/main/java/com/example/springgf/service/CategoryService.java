package com.example.springgf.service;


import com.example.springgf.controller.request.categoryrequest;
import com.example.springgf.entity.categories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<categoryrequest> catepage();

    List<categories> list();
}
