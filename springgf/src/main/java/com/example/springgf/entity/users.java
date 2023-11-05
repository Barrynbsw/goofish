package com.example.springgf.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class users {
@TableId
    Integer UserID;
    String Username;
    String Password;
    String email;
    String phone;
    String address;
    String city;
}