package com.wj.sort;

import java.util.Arrays;

/**
 * 对数器
 * 做出的题，不知道到底是否正确，此时就需要用到对数器
 * 1、实现一个随机样本产生器
 * 2、你想检测的方法a
 * 3、一个时间复杂度不是很好但是很好实现的方法b（也可以是api中已有的方法）
 * 4、用方法a和方法b同时去跑相同的随机样本，比较得到的结果
 * 5、如果有一个随机样本跑出的结果不一样则打印样本，进行人工干预
 * 6、用大量的随机样本去测试，已确定你的方法a就是一个正确的方法
 */
public class Detector {
    // 随机样本产生器
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // Math.random() -> [0,1) 所有的小数，等概率返回一个
        // Math.random() * N -> [0,N) 所有小数，等概率返回一个
        // (int)(Math.random() * N) -> [0,N-1] 所有的整数，等概率返回一个
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())]; // 长度随机
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // 拷贝一个数组
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int [] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // 对比两个数组
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }
}
