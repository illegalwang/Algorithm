package com.wj.sort;

/**
 * 插入排序
 */
public class A003_InsertionSort {
    public static void insertion(int[] arr) {
        if (arr == null || arr.length < 1) {
            return;
        }
        // 使 0 ~ i 做到有序。
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }
    }

    // i和j是一个位置的话，会出错。
    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int testTime = 20000;
        int maxSize = 500;
        int maxValue = 500;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = Detector.generateRandomArray(maxSize, maxValue);
            int[] arr1 = Detector.copyArray(arr);
            int[] arr2 = Detector.copyArray(arr);
            insertion(arr1);
            Detector.comparator(arr2);
            if (!Detector.isEqual(arr1, arr2)) {
                succeed = false;
                Detector.printArray(arr);
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Error----");

        int[] arr = Detector.generateRandomArray(maxSize, maxValue);
        Detector.printArray(arr);
        insertion(arr);
        Detector.printArray(arr);
    }
}
