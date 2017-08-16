package com.iag.leetcode.algorithms.ningjing.a002;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @Author jing.ning@mljr.com
 * @Date 2017/8/15 上午10:57
 */
public class AddTwoNumberTest {
  private A002AddTwoNumbers addTwoNumber;

  @Before
  public void init(){
    addTwoNumber = new A002AddTwoNumbers();
  }

  @Test
  public void testWithDiffLength() {
    LinkList a = generateLinkList(135);
    LinkList b = generateLinkList(60);
    LinkList result = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("5->9->1", result.toString());

    a = generateLinkList(50);
    b = generateLinkList(145);
    LinkList result2 = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("5->9->1", result2.toString());
  }

  @Test
  public void testWithSameLength() {
    LinkList a = generateLinkList(342);
    LinkList b = generateLinkList(465);
    LinkList result = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("7->0->8", result.toString());
  }

  @Test
  public void testWithZero() {
    LinkList a = generateLinkList(342);
    LinkList b = generateLinkList(0);
    LinkList result = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("2->4->3", result.toString());

    a = generateLinkList(0);
    b = generateLinkList(0);
    LinkList result2 = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("0", result2.toString());
  }

  @Test
  public void testWithFullCarries() {
    LinkList a = generateLinkList(999);
    LinkList b = generateLinkList(999);
    LinkList result = addTwoNumber.addTwoNumbers(a, b);
    Assert.assertEquals("8->9->9->1", result.toString());
  }

  private LinkList generateLinkList(int number) {
    if (number < 0) {
      System.err.println("The number should not be negative!");
    }
    LinkList curNode = new LinkList(0);
    ;
    LinkList head = curNode;
    while (number / 10 > 0) {
      curNode.val = number % 10;
      curNode.next = new LinkList(0);
      curNode = curNode.next;
      number = number / 10;
    }
    curNode.val = number % 10;
    return head;
  }

}
