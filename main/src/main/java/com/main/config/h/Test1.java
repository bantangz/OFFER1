package com.main.config.h;


import org.apache.commons.lang3.StringUtils;

public class Test1 {

    public static void main(String[] args) {
        String a = "";
        a = null;
        String b = "a";
//        a = " ";
        System.out.println(StringUtils.isAllBlank(a,b));


    }
}
