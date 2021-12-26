package com.wj.tiro;

/**
 * 返回1！ + 2！ + 3！ + 4！ + 5！ + ...... + N！的结果
 */
public class Code_01_SumOfFactorial {

    // 方法1
    public static long f1(int N) {
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += factorial(i);
        }
        return ans;
    }

    public static long factorial(int N) {
        long ans = 1;
        for (int i = 1; i <= N; i++) {
            ans *= i;
        }
        return ans;
    }

    // 方法2
    public static long f2(int N) {
        long ans = 0;
        long res = 1;
        for(int i = 1; i <= N; i++) {
            res *= i;
            ans += res;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(f1(10));
        System.out.println(f2(10));
    }
}
