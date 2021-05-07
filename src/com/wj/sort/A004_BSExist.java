package com.wj.sort;

/**
 * 二分查找
 * 查找一个数是否在有序数组中存在
 * 1 l最左边的坐标，r最右边的坐标，中间坐标开始找
 * 2 如果中间这个数大于要找的数，那么右边的数肯定都大，
 *   所以最右边的坐标r变成 (mid - 1)
 * 3 如果中间这个数小于要找的数，那么左边的数肯定都小，
 *   所以最左边的坐标变成 (mid + 1)
 * 4 然后再二分，直到没有数
 */
public class A004_BSExist {
    public static boolean exist(int[] arr, int num) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        int l = 0;
        int r = arr.length - 1;
        int mid = 0;
        while (l < r) {
            // (r + l ) / 2是求的中间坐标值。
            // 但是如果r和l特别大容易溢出，所以下面写法比较安全。
            mid = l + ((r - l) >> 1);
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return arr[l] == num;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,11,13,23,40};
        System.out.println(exist(arr, 4));
    }
}
