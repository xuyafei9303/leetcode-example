package com.ixyf.simple;

/**
 * 整数反转
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 */
public class Reverse007 {

    public static int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            int t = x % 10;
            int newRet = ret * 10 + t;
            if ((newRet - t) / 10 != ret) {
                return 0;
            }
            ret = newRet;
            x = x / 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        reverse(-6392929);
    }
}
