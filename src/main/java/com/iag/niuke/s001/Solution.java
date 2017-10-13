package com.iag.niuke.s001;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/10 下午12:51
 */
public class Solution {

    public int solution(String source){
        int length = source.length();
        Set charSet = new HashSet();
        for (int i = 0; i < length; i++) {
            charSet.add(source.charAt(i));
            if(charSet.size() > 2){
                return 0;
            }
        }
        if(charSet.size() == 2){
            return 2;
        }else {
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  s = sc.nextLine();
        Solution solution = new Solution();
        int num = solution.solution(s);
        System.out.println(num);
    }
}
