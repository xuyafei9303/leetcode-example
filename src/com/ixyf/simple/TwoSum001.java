package com.ixyf.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * 思路：
 * 先对nums数组进行遍历，遍历的时候拿到index对应的值，用target-nums[i]，得到一个temp值
 * 然后我们去HashMap里面去比对看是否存在这个值，如果存在，我们就找到了
 *
 */
public class TwoSum001 {

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length <= 1) return new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5,7,5,3,3};
        int target = 9;
        twoSum(nums, target);
    }
}
