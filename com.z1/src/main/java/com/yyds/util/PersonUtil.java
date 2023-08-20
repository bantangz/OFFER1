package com.yyds.util;

public class PersonUtil {

    private String name;
    private Long age;


    public PersonUtil(String name,Long age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return "姓名"+name+"年龄"+age;
    }

    public String haha(){
        return "哈哈";
    }
}
