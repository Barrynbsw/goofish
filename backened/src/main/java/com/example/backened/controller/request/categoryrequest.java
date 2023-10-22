package com.example.backened.controller.request;

import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

@Data
public class categoryrequest {
int CategoryID;
String CategorName;
String  Categoryimage;
List<categoryrequest> Children=new ArrayList<>();
}
