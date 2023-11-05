package com.example.springgf.controller.request;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class categoryrequest {
int CategoryID;
String CategorName;
String  Categoryimage;
List<categoryrequest> Children=new ArrayList<>();
}
