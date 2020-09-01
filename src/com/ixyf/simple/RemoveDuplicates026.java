package com.ixyf.simple;

/**
 * 26. 删除排序数组中的重复项
 * 删除排序数组中的重复项
 * 思路：
 * 利用双指针，前面在0和1的位置，如果两个指针的值相等，那么就让1位置的指针后移，在比较，直到两个指针的值不相等，相等说明数值重复，只有不相等的才不重复
 * 如果在判断到不重复了以后，前面的0的指针也要开始后移了，需要后移到另一个的指针＋1的位置再重复以上比较直到达到数组的末尾
 */
public class RemoveDuplicates026 {

    public int removeDuplicates(int [] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
