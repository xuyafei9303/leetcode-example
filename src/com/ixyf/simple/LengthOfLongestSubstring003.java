package com.ixyf.simple;

import java.util.HashMap;

/**
 * 无重复字符的最长子串
 *
 * 思路：滑动窗口 abcbagbd
 * 从字符串的左侧0位置开始，进行遍历，如果没有重复的，放到map中，往后遍历，当出现重复，只需要移动滑动指针，滑动到不重复为止即可
 * 时间复杂度：O(N)
 */
public class LengthOfLongestSubstring003 {
    public static int lengthOfLongestSubstring(String s) {
        // 先判断边界条件
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // 最长不重复的子串长度
        int i = 0;
        // 需要滑动的指针
        int j = 0;
        for (int k = 0; k < s.length(); k++) {
            if (map.containsKey(s.charAt(k))) {
                j = Math.max(j, map.get(s.charAt(k)) + 1);
            }
            map.put(s.charAt(k), k);
            i = Math.max(i, k - j + 1);
        }

        return i;
    }

    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("pwwkew");
        System.out.println("i = " + i);
    }
}
