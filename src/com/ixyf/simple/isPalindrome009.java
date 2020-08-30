package com.ixyf.simple;

/**
 * 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 *
 */
public class isPalindrome009 {

    public boolean isPalindrome(int x) {
        /**
         * 如果x是0~9之间，那么绝对是回文数
         * 如果x是负数，绝对不是回文数
         */
        if ((x % 10 == 0 && x != 0) || x < 0) {
            return false;
        }

        /**
         * 在判断中x是不断减小的，revertedNumber是不断增大的，只有x比revertedNumber大的时候才符合判断
         */
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        /**
         * 两种判断，
         * 一种刚好分割为两例如123321
         * 一种为12321
         */
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
