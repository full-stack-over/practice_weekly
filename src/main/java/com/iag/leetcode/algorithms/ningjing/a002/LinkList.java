package com.iag.leetcode.algorithms.ningjing.a002;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/15 上午10:43
 */
public class LinkList {
    int val;
    LinkList next;
    LinkList(int x) { val = x; }

    @Override
    public String toString(){
        LinkList node = this;
        StringBuffer sb = new StringBuffer("");
        while (node!=null){
            sb.append(node.val);
            if(node.next!=null)
            {
                sb.append("->");
            }
            node = node.next;
        }
        return sb.toString();
    }
}
