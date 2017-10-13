package com.iag.leetcode.algorithms.xueshan.a007;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 下午5:56
 */
public class ReverseInteger {

    public int reverse(int x){
        String num = String.valueOf(Math.abs(x));
        StringBuilder newNum = new StringBuilder();
        for(int i = num.length() - 1; i >= 0; i --){
            newNum.append(num.charAt(i));
        }
        try{
            Integer result = Integer.parseInt(newNum.toString());

            return x >= 0 ? result : result * -1;
        }catch (Exception e){
            return 0;
        }

    }

}
