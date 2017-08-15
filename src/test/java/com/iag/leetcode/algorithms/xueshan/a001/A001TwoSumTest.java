package com.iag.leetcode.algorithms.xueshan.a001;

import com.iag.leetcode.algorithms.xueshan.a001.A001TwoSum;
import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 上午10:31
 */
public class A001TwoSumTest {

    @Test
    public void test(){
        int [] nums = {2, 7, 11, 15};
        int targer = 9;

        A001TwoSum twoSum = new A001TwoSum();

        int [] result = twoSum.twoSum(nums, targer);
        System.out.println(result);

        for(int i : result){
            System.out.println(i);
        }
    }
}
