package com.iag.leetcode.algorithms.xueshan.a002;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/8/15 上午10:43
 */
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = null, tempNode, aimNode = null;
        int num1, num2, sum, digit, carrybit = 0;
        while(l1 != null || l2 != null){
            num1 = l1 != null ? l1.val : 0;
            num2 = l2 != null ? l2.val : 0;

            sum = num1 + num2 + carrybit;
            carrybit = sum / 10;

            digit = sum % 10;

            if(listNode == null){
                listNode = new ListNode(digit);
                aimNode = listNode;
            }else {
                tempNode = new ListNode(digit);
                aimNode.next = tempNode;
                aimNode = tempNode;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carrybit > 0){
            tempNode = new ListNode(carrybit);
            aimNode.next = tempNode;
        }
        return listNode;
    }
}
