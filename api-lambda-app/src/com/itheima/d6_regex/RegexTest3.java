package com.itheima.d6_regex;

import java.util.Scanner;

public class RegexTest3 {
    public static void main(String[] args) {
        // 校验手机号、邮箱、电话号
//        checkPhone();
//        checkEmail();
        checkTel();
    }

    public static void checkTel(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入电话号:");
            String phone = sc.next();
            // 1521265074@qq.com
            // 1521265sadf074@163.com
            // 1521265sadf074@pci.com.cn

            if(phone.matches("0\\d{2,6}-?\\d{5,20}")){
                System.out.println("电话格式正确，注册完成");
            } else {
                System.out.println("格式有误");
            }
        }
    }
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入邮箱:");
            String phone = sc.next();
            // 1521265074@qq.com
            // 1521265sadf074@163.com
            // 1521265sadf074@pci.com.cn

            if(phone.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")){
                System.out.println("邮箱格式正确，注册完成");
            } else {
                System.out.println("格式有误");
            }
        }
    }

    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入手机号:");
            String phone = sc.next();
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("手机号码格式正确，注册完成");
            } else {
                System.out.println("格式有误");
            }
        }
    }


}
