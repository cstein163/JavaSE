package com.itheima.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        // 学会解析字符串时间成为日期对象
        String dateStr = "2021年08月06日 11:11:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        System.out.println(sdf);
        Date d = sdf.parse(dateStr);
        System.out.println(d);

        long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60)*1000;

        System.out.println(sdf.format(time));

    }

}
