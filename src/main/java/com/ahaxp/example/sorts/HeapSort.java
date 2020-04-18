package com.ahaxp.example.sorts;


import org.junit.Test;

import java.util.Arrays;

public class HeapSort {


    /**
     * 堆排序
     * 时间复杂度: O(nlogn)
     * 空间复杂度: O(1)
     * 不稳定
     */
    public static void main(String[] args) {
        int[] arr = {99, 22, 33, 11, 44, 88, 77, 66};
        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 完全二叉树的第i个节点的左子节点的索引为 (2i + 1)
     *                    右子节点的索引为 (2i + 2)
     *            i的父节点的索引为　：　　　((i-1) / 2)
     */


    public void heapSort(int[] arr) {
        int len = arr.length -1;
        // 第一个非叶子节点的索引, 从这个位置往前做heapify
        int beginIndex = (arr.length >> 1) - 1;
        for (int i = beginIndex; i >= 0; i--) {
            minHeapify(arr, i, len);
//            maxHeapify(arr, i, len);
        }
        //　此时完全二叉树已堆化, 第0个位置的索引是最小值
        for (int i = len; i > 0; i--) {
            // 将第0个位置的值放到最后面
            swap(arr, 0, i);
            // 此时破坏了堆结构, 继续对0-(i-1)个元素做heapify
            minHeapify(arr, 0, i - 1);
//            maxHeapify(arr, 0, i - 1);
        }
    }

    // 大根堆
    private void minHeapify(int[] arr, int index, int len) {
        // 左子节点索引
        int leftIndex = (index << 1) + 1;
        // 右子节点索引
        int rightIndex = leftIndex + 1;
        // 假设左子节点最大
        int maxIndex = leftIndex;
        // 超出索引, 跳出递归条件
        if (leftIndex > len) return;
        // 判断左右两个子节点哪个更大
        if (rightIndex <= len && arr[rightIndex] > arr[leftIndex]) {
            // 右子节点大
            maxIndex = rightIndex;
        }
        if (arr[maxIndex] > arr[index]) {
            // 比父节点大, 交换位置, 继续做heapify
            swap(arr, maxIndex, index);
            minHeapify(arr, maxIndex, len);
        }
    }

    // 小根堆
    private void maxHeapify(int[] arr, int index, int len) {
        // 左子节点索引
        int leftIndex = (index << 1) + 1;
        // 右子节点索引
        int rightIndex = leftIndex + 1;
        // 假设左子节点最小
        int minIndex = leftIndex;
        // 超出索引, 跳出递归条件
        if (leftIndex > len) return;
        // 判断左右两个子节点哪个更小
        if (rightIndex <= len && arr[rightIndex] < arr[leftIndex]) {
            // 右子节点小
            minIndex = rightIndex;
        }
        if (arr[minIndex] < arr[index]) {
            // 比父节点大, 交换位置, 继续做heapify
            swap(arr, minIndex, index);
            minHeapify(arr, minIndex, len);
        }
    }

    /**
     * 一个简单的交换数组两个元素的方法
     * @param arr　要交换的数组
     * @param i   　交换的元素１
     * @param j    交换的元素２
     */
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
