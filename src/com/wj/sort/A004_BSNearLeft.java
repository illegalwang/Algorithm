package com.wj.sort;

/**
 * 二分查找
 * 查找有序数组中，>=某个数最左侧的位置
 */
public class A004_BSNearLeft {
    public static int nearestIndex(int[] arr, int num) {
        int l = 0;
        int r = arr.length - 1;
        int index = -1; // 记录当前>=num最左侧的位置
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (arr[mid] >= num) {
                index = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 3, 5, 5, 5, 5, 8, 9, 9, 9, 11, 11, 13, 23, 40};
        System.out.println(nearestIndex(arr, 13));
    }
}
