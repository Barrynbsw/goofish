package com.example.springgf.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class products {
    int productID;
    String title;
    String description;
    String price;
    int userID;
    int categoryID;
}