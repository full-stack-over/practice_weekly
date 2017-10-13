package com.iag.leetcode.algorithms.xueshan.a007;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 下午5:58
 */
public class ReverseIntegerTest {

    @Test
    public void testReverse(){
        int [] cases = {0, 1000, -1000, 4521, -8764, 1534236469};
        int [] expecteds = {0, 1, -1, 1254, -4678, 0};
        int [] actuals = {0, 0, 0, 0, 0, 0};

        ReverseInteger reverseInteger = new ReverseInteger();


        for(int i = 0; i < cases.length; i ++){
            actuals[i] = reverseInteger.reverse(cases[i]);
        }

        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void test(){
        String num = "00001";
        Integer num2 = Integer.parseInt(num);
        System.out.println(num2.intValue());
    }
}
