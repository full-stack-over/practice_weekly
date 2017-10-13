package com.iag.niuke.s003;

import java.util.Scanner;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/10 下午6:27
 */
public class Main {
    private static final String template = "101010101010101010101010101010101010101010101010101010";

    private static int find(String s, int beg, int temIndex){
        int length = 0;
        for(int j = beg, k = temIndex; j < s.length(); j ++, k++){
            if(s.charAt(j) != template.charAt(k)){
                return length = j - beg;
            }
        }
        return s.length() - beg;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int currMxl = 0;
        for (int i = 0; i < s.length(); i++) {
            int beg = i;
            int mxl = 0;
            if(s.charAt(beg) == template.charAt(0)){
                mxl = Main.find(s, i, 0);
            }else {
                mxl = Main.find(s, i, 1);
            }

            if(currMxl < mxl){
                currMxl = mxl;
            }
        }
        System.out.println(currMxl);
    }
}
