package com.ahaxp.example.sorts;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        /**
         * 选择排序:
         * 时间复杂度: O(n²)
         * 空间复杂度O: (1)
         * 不稳定排序
         * 原理:
         *      循环n轮, 每轮找出一个最大/最小位置索引, 找到后将第i个位置的值跟最大/最小索引位置的值互换
         *      前i个元素都是排好序的
         */
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
