package com.example.springgf.service;

import com.example.springgf.controller.request.productrequest;
import com.example.springgf.entity.products;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public interface ProductService {
    void add(HttpServletRequest r, products p, String catename);

    List<productrequest> guess();
}
