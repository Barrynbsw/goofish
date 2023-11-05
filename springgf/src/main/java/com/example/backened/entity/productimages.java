package com.example.backened.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public  class productimages {
    int imageID;
    String imageURL;
    int productID;

}