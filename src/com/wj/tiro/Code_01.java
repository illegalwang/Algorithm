package com.wj.tiro;

import javax.swing.*;

/**
 * 输出整型数的32位二进制信息。
 * int 32位  long 64位
 *
 * 与运算(&): 只有1&1才为1，其他都为0
 * 或运算(|): 有一个是1，就是1
 * 异或运算(^): 相同为0，不同为1
 * 左移(<<): 乘以2的n次方  (只有右移有无符号的)
 * 右移(>>): 除以2的n次方
 * 无符号右移(>>>):
 */
public class Code_01 {

    /**
     * 输出num的32位
     * @param num
     */
    public static void print(int num) {

        // 因为 1只有&1为1，其他都是0
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int num = 4;
//
//        print(num);


        // 位运算
        // &(与运算): 只有1&1才为1，其他都为0
        // |(或运算): 有一个是1，就是1
        // ^(异或运算): 相同为0，不同为1
//        int a = 15623;
//        int b = 54663;
//        print(a);
//        print(b);
//        System.out.println("=====================");
//        print(a & b);
//        print(a | b);
//        print(a ^ b);

        // 右移(>>): 除以2的n次方
        // 无符号右移(>>>):
//        int c = Integer.MIN_VALUE;
//        print(c);
//        print(c >> 1);
//        print(c >>> 1);

        // 取一个数的相反数
        int d = 5;
        int e = -d;
        System.out.println(d);
        System.out.println(e);
        // ~ 代表取反
        System.out.println((~d + 1));

    }
}
