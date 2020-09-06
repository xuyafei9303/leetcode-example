package com.ixyf.simple;

/**
 * 移除元素
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 *  
 *
 * 示例 1:
 *
 * 给定 nums = [3,2,2,3], val = 3,
 *
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 *
 * 双指针解法
 * 思路
 *
 * 既然问题要求我们就地删除给定值的所有元素，我们就必须用 O(1)O(1) 的额外空间来处理它。如何解决？我们可以保留两个指针 ii 和 jj，其中 ii 是慢指针，jj 是快指针。
 *
 * 算法
 *
 * 当 nums[j]nums[j] 与给定的值相等时，递增 jj 以跳过该元素。只要 nums[j] \neq valnums[j]
 * 
 * ​
 *  =val，我们就复制 nums[j]nums[j] 到 nums[i]nums[i] 并同时递增两个索引。重复这一过程，直到 jj 到达数组的末尾，该数组的新长度为 ii。
 */
public class RemoveElement027 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
