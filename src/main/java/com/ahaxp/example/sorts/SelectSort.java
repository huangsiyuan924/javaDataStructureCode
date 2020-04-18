package com.ahaxp.example.sorts;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {99, 22, 33, 11, 44, 88, 77, 66};

        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            // 每轮找出一个最小的数, 前i个元素已经排好序了
            for (int j = i; j < arr.length; j++) {
                    // 两两之间比较大小, 找出最小索引
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // 交换位置
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
