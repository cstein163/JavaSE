package com.itheima.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑得很慢~~~~");
            }
        };
        a.run();

//        // 不是任何匿名内部类都可以被简化
//        Animal a1 = () -> {
//            System.out.println("乌龟跑得很慢~~~~");
//        };
//        a1.run();

    }

}

abstract class Animal{
    public abstract void run();
}
