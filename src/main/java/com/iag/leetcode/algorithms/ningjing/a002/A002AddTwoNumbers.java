package com.iag.leetcode.algorithms.ningjing.a002;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/16 上午10:43
 */
public class A002AddTwoNumbers {

    /**
     * Calculate the sum of two non-negative integers(a & b) represented as link list,
     * and the digits are stored in reverse order and each of their nodes contain a single digit.
     * @param a
     * @param b
     * @return the sum of (a + b), and represented as link list
     */
    public LinkList addTwoNumbers(LinkList a, LinkList b){
        LinkList resultNode=new LinkList(0), head=resultNode, preNode = null;
        int carry = 0;
        LinkList aCurrentNode=a, bCurrentNode = b;
        int aValue, bValue;
        while( aCurrentNode != null || bCurrentNode!=null){
            //If no digit for either a or b in the current loop, then use 0 instead.
            if(aCurrentNode!=null){
                aValue = aCurrentNode.val;
            }else{
                aValue = 0;
            }

            if(bCurrentNode!=null){
                bValue = bCurrentNode.val;
            }else{
                bValue = 0;
            }

            int sum = aValue+bValue+carry;
            carry = sum/10;
            sum = sum % 10;

            resultNode.val = sum;
            resultNode.next = new LinkList(carry);

            //For next loop
            preNode = resultNode;
            resultNode = resultNode.next;
            aCurrentNode = aCurrentNode!=null? aCurrentNode.next:null;
            bCurrentNode = bCurrentNode!=null? bCurrentNode.next:null;
        }
        if(resultNode.val == 0){
            preNode.next = null;
        }
        return head;
    }

    public LinkList addTwoNumbersByXueShan(LinkList l1, LinkList l2) {
        LinkList listNode = null, tempNode, aimNode = null;
        int num1, num2, sum, digit, carrybit = 0;
        while(l1 != null || l2 != null){
            num1 = l1 != null ? l1.val : 0;
            num2 = l2 != null ? l2.val : 0;

            sum = num1 + num2 + carrybit;
            carrybit = sum / 10;

            digit = sum % 10;

            if(listNode == null){
                listNode = new LinkList(digit);
                aimNode = listNode;
            }else {
                tempNode = new LinkList(digit);
                aimNode.next = tempNode;
                aimNode = tempNode;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if(carrybit > 0){
            tempNode = new LinkList(carrybit);
            aimNode.next = tempNode;
        }
        return listNode;
    }
}
