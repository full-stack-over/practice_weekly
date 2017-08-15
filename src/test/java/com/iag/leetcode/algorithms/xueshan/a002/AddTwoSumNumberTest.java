package com.iag.leetcode.algorithms.xueshan.a002;

import org.junit.Test;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 上午10:57
 */
public class AddTwoSumNumberTest {

    @Test
    public void test(){
        ListNode l1 = new ListNode(1);
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(3);


        l1.next = l1_1;
        l1_1.next = l1_2;

        ListNode l2 = new ListNode(5);
        ListNode l2_1 = new ListNode(6);

        l2.next = l2_1;

        AddTwoNumber addTwoNumber = new AddTwoNumber();
        ListNode listNode = addTwoNumber.addTwoNumbers(l1, l2);
        ListNode temp = listNode;
        while (temp != null){
            System.out.print(temp.val);
            if(temp.next != null){
                System.out.print("-->");
            }
            temp = temp.next;
        }
    }
}
