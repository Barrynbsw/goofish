package com.example.backened.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class users {
    int userID;
    String Username;
    String Password;
    String email;
    String phone;
    String address;
    String city;
}