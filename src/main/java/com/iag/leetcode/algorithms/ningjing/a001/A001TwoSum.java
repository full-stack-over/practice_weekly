package com.iag.leetcode.algorithms.ningjing.a001;

import java.util.Arrays;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/16 上午10:29
 */
public class A001TwoSum {

  /**
   * Assumption: the array has been sorted by asc
   * @param nums
   * @return indices of the two number, e.g., "5,9"
   */
  public String twoSum(int[] nums, int target) {
    String result = "Not found";
    for (int i = 0; i < nums.length; i++) {
      int a = nums[i];
      int b = target - a;
      int j = Arrays.binarySearch(nums, b);
      if(j!= -1){
        result = i+","+j;
        break;
      }
    }
    return result;
  }

  public int[] twoSumByXueShan(int[] nums, int target) {
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
