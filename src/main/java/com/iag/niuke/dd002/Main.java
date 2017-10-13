package com.iag.niuke.dd002;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/11 下午10:53
 */
public class Main {

    public int solve(int index, int deep, boolean select, Pi[] pis){
        if(deep == 3 ){

        }
        index ++;
        if(select == true){
            deep ++;
        }
        int num1 = solve(index, deep, true, pis);

        int num2 = solve(index, deep, false, pis);

        return num1 > num2 ? num1 : num2;
    }
    public static void main(String[] args) {

        int n = 3;
        int m = 5;
        int table [] = {2, 4, 2};

        Pi [] pis = {new Pi(1, 3),
                        new Pi(3, 5),
                        new Pi(3, 7),
                        //new Pi(5, 9),
                        new Pi(1, 10)
        };

        Main m1 = new Main();

        int sum = m1.solve(0, 0, false, pis);
        System.out.println(sum);
    }
}

class Pi{
    public int b;
    public int c;

    public Pi(int b, int c){
        this.b = b;
        this.c = c;
    }
}
