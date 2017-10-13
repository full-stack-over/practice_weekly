package com.iag.niuke.offer002;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/13 上午11:24
 */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        String temp = "%20";
        StringBuffer result = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == ' '){
                result.append(temp);
            }else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        StringBuffer str = new StringBuffer("We Are Happy ");
        String s = solution.replaceSpace(str);
        System.out.println(s);
    }
}
