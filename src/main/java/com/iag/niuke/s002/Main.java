package com.iag.niuke.s002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/10 下午5:35
 */
public class Main {

    public static void main(String[] args) {
        int len;
        Scanner scanner = new Scanner(System.in);
        len = scanner.nextInt();
        int [] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = scanner.nextInt();
        }
        //int [] nums = {3, 5, 1, 7};
        if(nums.length == 2){
            System.out.println("Possible");
        }else {
            boolean result = true;
            Arrays.sort(nums);
            int n = nums[1] - nums[0];
            for (int i = 2; i < nums.length; i++) {
                if(nums[i] - nums[i - 1] != n){
                    result = false;
                }
            }
            if(result == true){
                System.out.println("Possible");
            }else {
                System.out.println("Impossible");
            }
        }

    }
}
