package com.iag.niuke.s100;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/11 下午4:02
 */
import java.util.Date;

public class SuperTest extends Date{
    private static final long serialVersionUID = 1L;
    private static int i;
    private void test(){
        System.out.println(super.getClass().getName());
        System.out.println(this.getClass().getName());
    }

    public static void main(String[]args){

        new SuperTest().test();
        System.out.println(i);
        Object obj;
    }
}
