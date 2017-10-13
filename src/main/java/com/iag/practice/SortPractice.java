package com.iag.practice;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/12 下午4:12
 */
public class SortPractice {
    public void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    /**
     * 冒泡排序
     * @param arr
     */
    public void sortMaopao(int [] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        printArr(arr);
    }

    /**
     * 选择排序
     * @param arr
     */
    public void sortSelect(int [] arr){

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            int k = i;
            for (int j = i; j < length; j++) {

                if(arr[k] > arr[j]){
                    k = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }

        printArr(arr);
    }

    /**
     * 插入排序
     * @param arr
     */
    public void sortInsert(int [] arr){

        int length = arr.length;
        int temp;
        int j = 0;
        for (int i = 0; i < length; i++) {

            temp = arr[i];
            for (j = i; j > 0 && temp < arr[j - 1] ; j--) {
                arr[j] = arr[j -1];
            }
            arr[j] = temp;
        }

        printArr(arr);

    }
    public static void main(String[] args) {
        int arr [] = {10, 2, -1, 4, 3, 8};
        SortPractice sp =  new SortPractice();
        //sp.sortMaopao(arr);

        //sp.sortSelect(arr);

        sp.sortInsert(arr);
    }
}
