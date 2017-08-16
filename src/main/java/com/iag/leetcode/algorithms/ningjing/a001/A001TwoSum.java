package com.iag.leetcode.algorithms.ningjing.a001;

import java.util.Arrays;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/16 上午10:29
 */
public class A001TwoSum {

  /**
   * Assumption: the array has been sorted by asc, and only have one solution or not
   * @param nums
   * @return indices of the two number, e.g., "5,9"
   */
  public String twoSum(int[] nums, int target) {
    String result = "Not Found";
    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      int b = target - a;
      int j = Arrays.binarySearch(nums, b);
      if(j>=0){
        result = i+","+j;
        break;
      }
    }
    return result;
  }

  public String twoSumByXueShan(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return i+","+j;
        }
      }
    }
    return "Not Found";
  }
}
