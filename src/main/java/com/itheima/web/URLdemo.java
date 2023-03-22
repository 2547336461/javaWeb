package com.itheima.web;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLdemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String username = "张三";
        // URL编码
        String encode = URLEncoder.encode(username,"utf-8");
        System.out.println(encode);
        // 乱码演示
        String decode = URLDecoder.decode(encode, "iso-8859-1");
        System.out.println(decode);
        // 解决乱码
        byte[] bytes = decode.getBytes("iso-8859-1");
        for (byte aByte : bytes) {
            System.out.print(aByte+"");
        }
        String s = new String(bytes, "utf-8");
        System.out.println(s);
    }
}
