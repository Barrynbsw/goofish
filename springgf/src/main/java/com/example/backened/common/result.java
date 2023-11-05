package com.example.backened.common;

import lombok.Data;

@Data
public class result {
    private static final String SUCCESS_CODE ="200";
    private static final String ERROR_CODE ="0";
    private String code;
    private Object data;
    private String msg;
    public static result success(){
        result r=new result();
        r.setCode(SUCCESS_CODE);
        return r;
    }
    public static result success(Object data){
        result r=new result();
        r.setCode(SUCCESS_CODE);
        r.setData(data);
        return r;
    }
    public static result error(){
        result r=new result();
        r.setCode(ERROR_CODE);
        return  r;
    }
}
