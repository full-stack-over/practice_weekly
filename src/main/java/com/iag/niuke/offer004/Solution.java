package com.iag.niuke.offer004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author xueshan.wei@mljr.com
 * @Date 2017/10/13 下午6:35
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        buildTree1(root, pre, in);
        return root;
    }

    public void buildTree1(TreeNode node, int [] pre, int [] in){

        if(pre.length == 0){
            return;
        }
        // 分割中序数组
        int centerIndex = 0;
        for (int i = 0; i < in.length; i++) {
            if(in[i] == pre[0]){
                centerIndex = i;
                break;
            }
        }

        int [] leftIn = new int [centerIndex];
        int [] leftPre = new int [centerIndex];

        int [] rightIn = new int[in.length - 1 - centerIndex];
        int [] rightPre = new int[in.length - 1 - centerIndex];

        int leftPreIndex = 0;
        int leftInIndex = 0;
        int rightPreIndex = 0;
        int rightInIndex = 0;
        for (int i = 1; i < pre.length; i++) {
            if(i <= centerIndex){
                leftPre[leftPreIndex ++] = pre[i];
            }else {
                rightPre[rightPreIndex ++] = pre[i];
            }
        }
        for (int i = 0; i < in.length; i++) {
            if(i == centerIndex){
                continue;
            }else if(i < centerIndex){
                leftIn[leftInIndex ++] = in[i];
            }else {
                rightIn[rightInIndex ++] = in[i];
            }
        }
        if(leftPre.length != 0){
            node.left = new TreeNode(leftPre[0]);
        }
        // 构建左边
        buildTree1(node.left, leftPre, leftIn);

        // 构建右边
        if(rightPre.length != 0){
            node.right = new TreeNode(rightPre[0]);
        }
        buildTree1(node.right, rightPre, rightIn);
    }

    public void buildTree(TreeNode node, int [] pre, int [] in, boolean isLeft){

        int leftIndex = 0, rightIndex = 0;
        List inLeft = new ArrayList();
        List inRight = new ArrayList();
        boolean findRoot = false;
        for (int i = 0; i < in.length; i++) {
            if(in[i] == pre[0]){
                findRoot = true;
                continue;
            }

            if(findRoot == false){
                inLeft.add(in[i]);
            }else {
                inRight.add(in[i]);
            }
        }

        // 分割前序数组
        for (int i = 1; i < pre.length; i++) {

        }

        printList(inLeft);
        printList(inRight);
    }

    public static void main(String[] args) {
        int [] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int [] in = {4, 7, 2, 1, 5, 3, 8, 6};

        Solution solution = new Solution();
        solution.reConstructBinaryTree(pre, in);
    }

    public void printList(List<Integer> list){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
