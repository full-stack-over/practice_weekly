package com.iag.niuke.offer003;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/13 上午11:31
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        if(listNode == null){
            return list2;
        }
        while (listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(list.size());

        for (int i = list.size() - 1; i >= 0; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode listNode = null;

        solution.printListFromTailToHead(listNode);
    }
}