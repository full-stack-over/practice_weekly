package com.iag.leetcode.algorithms.ningjing.a001;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/15 上午10:31
 */
public class A001TwoSumTest {

    A001TwoSum twoSum = new A001TwoSum();

    @Test
    public void testBestCase(){
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertEquals("0,1", twoSum.twoSum(nums, target));
    }

    @Test
    public void testWorstCaseInShortArray(){
        int [] nums = {2, 7, 11, 15};
        int target = 26;
        Assert.assertEquals("2,3", twoSum.twoSum(nums, target));
    }

    @Test
    public void testNotFound(){
        int [] nums = {2, 7, 11, 15};
        int target = 10;
        Assert.assertEquals("Not Found", twoSum.twoSum(nums, target));
    }

    @Test
    public void testWorstCase(){
        int count = 100000;
        WorstCase worstCase = generateWorstCase(count);
        Assert.assertEquals((count-2)+","+(count-1), twoSum.twoSum(worstCase.nums, worstCase.target));
    }

    private WorstCase generateWorstCase(int count){
        WorstCase worstCase = new WorstCase();
        worstCase.nums = new int[count];
        for(int i=0;i<count;i++){
            worstCase.nums[i] = i+1;
        }
        worstCase.target = count*2-1;
        return worstCase;
    }

    class WorstCase{
        int[] nums;
        int target;
    }
}
