package com.example.springgf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class users {
    int userID;
    String username;
    String password;
    String email;
    String phone;
    String address;
}