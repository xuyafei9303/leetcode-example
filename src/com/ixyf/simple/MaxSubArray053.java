package com.ixyf.simple;

/**
 * 53. 最大子序和
 *
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 */
public class MaxSubArray053 {
    public int maxSubArray(int[] nums) {
        int ret = nums[0], sum = 0;
        for(int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            ret = ret > sum ? ret:sum;
            if(sum < 0) sum = 0;
        }
        return ret;
    }
}
