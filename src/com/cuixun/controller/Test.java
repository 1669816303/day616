package com.cuixun.controller;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test {
    public static void main(String[] args) throws Exception{
        System.out.println(URLEncoder.encode("马化腾","utf8"));
        System.out.println(URLDecoder.decode("%C3%A9%C2%A9%C2%AC%C3%A5%C2%8C%C2%96%C3%A8%C2%85%C2%BE","utf-8"));
    }
}
