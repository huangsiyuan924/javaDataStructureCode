package com.ahaxp.example.sorts;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        // 冒泡排序: 时间复杂度 O(n²), 稳定排序
        int[] arr = {99, 22, 33, 11, 44, 88, 77, 66};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 降序
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
