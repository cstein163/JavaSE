package com.itheima.d7_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] arr = {10,2,55,23,24,100};
        System.out.println(arr);
        // 1.打印数组内容
        String rs = Arrays.toString(arr);
        System.out.println(rs);

        System.out.println(Arrays.toString(arr));

        // 2. 排序的API
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 3.二分搜索(前提数组必须排好序,否则出bug)
        int index = Arrays.binarySearch(arr,55);
        System.out.println(index);

        // 如果不存在，返回  -(应插入的位置+1)
        int index2 = Arrays.binarySearch(arr,22);
        System.out.println(index2);
        System.out.println("-----------------------");

        // 数组没有排好序，可能会找不到存在的元素，出bug
        int[] arr2 = {12, 36, 34, 25, 13, 24, 234, 100};
        System.out.println(Arrays.binarySearch(arr2, 36));

    }

}
