package com.iag.leetcode.algorithms.xueshan.a008;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/25 下午4:31
 */
public class StringToIntegerTest {

    @Test
    public void testMyAtoi(){
        StringToInteger stringToInteger = new StringToInteger();
        String [] cases = {"10000", "-0987444", "   0010", "   -0019", "189  "};

        int [] expected = {10000, -987444, 10, -19, 189};

        int [] actuals = {0, 0};
        for(int i = 0; i < cases.length; i++){
            actuals[i] = stringToInteger.myAtoi(cases[i]);
        }
        Assert.assertArrayEquals(expected, actuals);
    }
}
