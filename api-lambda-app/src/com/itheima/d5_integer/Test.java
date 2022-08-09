package com.itheima.d5_integer;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a;     // 自动装箱
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        Integer it = 100;
        int it1 = it;
        System.out.println(it1);

        double db = 99.5;
        Double db2 = db;
        double db3 = db2;
        System.out.println(db3);

//        int age = null;
        Integer age1 = null;
        System.out.println(age1);

        System.out.println("------------------");
        // 1. 包装类可以把基本类型的数据转为字符串
        Integer i3 = 23;
        System.out.println(i3.toString() + 1);

    }

}
