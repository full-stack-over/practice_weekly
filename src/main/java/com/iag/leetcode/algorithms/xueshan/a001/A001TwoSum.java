package com.iag.leetcode.algorithms.xueshan.a001;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 上午10:29
 */
public class A001TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
