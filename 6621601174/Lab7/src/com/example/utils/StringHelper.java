package com.example.utils;

public class StringHelper {
    public static String reverse (String text) {
        //แบบเต็ม
        //StringBuilder str = new StringBuilder();
        //String revStr = str.reverse().toString();
        //return revStr;
        //แบบย่อ
        return new StringBuilder(text).reverse().toString();
    }
}
