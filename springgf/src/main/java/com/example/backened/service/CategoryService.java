package com.example.backened.service;

import com.example.backened.controller.request.categoryrequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<categoryrequest> catepage();
}
