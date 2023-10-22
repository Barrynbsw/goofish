package com.example.backened.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class categories {
    int categoryID;
    String categoryName;
    int parentCategoryID;
    String categoryimage;
}