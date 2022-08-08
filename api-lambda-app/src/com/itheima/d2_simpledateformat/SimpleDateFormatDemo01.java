package com.itheima.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
//        1. 日期对象
        Date d = new Date();
        System.out.println(d);
//        2.格式化这个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
//        3.开始格式化日期对象为喜欢的字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);
        System.out.println("------------------------");
//        4.格式化时间毫秒值
        long time1 = System.currentTimeMillis()+121*1000;       // System.currentTimeMillis()产生时间毫秒值
        System.out.println(time1);
        String rs2 = sdf.format(time1);
        System.out.println(rs2);

    }
}
