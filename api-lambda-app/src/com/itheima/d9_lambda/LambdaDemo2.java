package com.itheima.d9_lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳贼溜~~~~~");
            }
        };
        go(s1);

        Swimming s2 = () -> {
            System.out.println("老师游泳贼溜~~~~~");
        };
        go(s2);
    }

    public static void  go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");

    }

}

@FunctionalInterface        // 一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
//    void swim();
}
