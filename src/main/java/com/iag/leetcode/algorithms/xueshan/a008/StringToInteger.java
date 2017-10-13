package com.iag.leetcode.algorithms.xueshan.a008;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/25 下午4:27
 */
public class StringToInteger {
    public int myAtoi(String str) {
        int length = str.length();
        int begin, end;
        for(int i = 0; i < length; i++){
            if(str.charAt(i) == ' '){

            }
        }
        try{
            Integer integer = Integer.parseInt(str);
            return integer.intValue();
        }catch (Exception e){
            return 0;
        }
    }
}
