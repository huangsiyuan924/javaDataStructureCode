package com.ahaxp.example.sorts;

import java.util.Arrays;

public class InsertSort {

    /**
     * 插入排序
     * 时间复杂度: O(n²)
     * 空间复杂度: O(1)
     * 稳定排序
     */
    public static void main(String[] args) {
        int[] arr = {99, 22, 33, 11, 44, 88, 77, 66};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        if (arr.length == 0 || arr.length ==1) return;
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j;
            for (j = i; j > 0 && arr[j-1] > tmp; j--) {
                // 大于tmp, 就把这个元素往后面放
                arr[j] = arr[j - 1];
            }
            // 小于tmp, 就把tmp放到这个位置
            arr[j] = tmp;
//            System.out.println(Arrays.toString(arr));
        }
    }
}
