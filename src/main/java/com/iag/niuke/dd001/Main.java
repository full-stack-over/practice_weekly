package com.iag.niuke.dd001;

import java.util.Scanner;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/11 下午10:11
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int nums [] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        //int nums [] = {-7 3 9 3 -4 -1 4 6 -1 2 -3 4 6};
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {

                if(i == j){
                    sum = nums[i];
                }else {
                    sum = sum + nums[j];
                }

                if(sum > max){
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
