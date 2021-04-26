package com.wj.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 0 ~ N-1 的位置上找出最小的数放在0位置上
 * 1 ~ N-1 的位置上找出最小的数放在1位置上
 * 2 ~ N-1 的位置上找出最小的数放在2位置上
 * 。。。
 * N-1 ~ N-1 的位置上找出最小的数放在N-1位置上
 */
public class A001_SelectionSort {

    public static void SelectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, minIndex, i);
        }
    }

    public static void swap(int[] arr, int minIndex, int i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 22, 0, 12, 3, 9};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
