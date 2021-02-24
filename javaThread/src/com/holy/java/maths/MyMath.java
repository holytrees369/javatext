package com.holy.java.maths;

/**
 * @author YongTao
 * @create 2020-12-23 10 : 12
 */
public class MyMath {
    public static void main(String[] args) {
        double a = 6.1;
        double b = 6.7;
        double c = 5.7;
        double d = 5.4;

        System.out.println(Math.ceil(a));
        System.out.println(Math.ceil(b));
        System.out.println(Math.ceil(c));
        System.out.println(Math.ceil(d));
        System.out.println("============");

        System.out.println(Math.floor(a));
        System.out.println(Math.floor(b));
        System.out.println(Math.floor(c));
        System.out.println(Math.floor(d));

        System.out.println("=============");
        System.out.println(Math.round(a));
        System.out.println(Math.round(b));
        System.out.println(Math.round(c));
        System.out.println(Math.round(d));
    }
}
