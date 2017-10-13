package com.iag.niuke.offer001;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/13 上午10:53
 */

public class Solution {
    public boolean Find1(int target, int [][] array) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean Find(int target, int [][] array){

        int rows = array.length;
        int cols = array[0].length;

        int i = rows - 1, j = 0;
        while (i >= 0 && i < rows && j >= 0 && j < cols){
            if(target == array[i][j]){
                return true;
            }else if(target < array[i][j]){
                i --;
            }else {
                j ++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {3, 5, 7, 9}
        };

        Solution solution = new Solution();
        boolean find = solution.Find(3, arr);

        System.out.println(find);
    }
}