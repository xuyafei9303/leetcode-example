package com.ixyf.simple;

/**
 * 这种是利用了递归的方法
 * 上下两个有序链表相互比较，如果l1的val大于l2的val，则l2的next才是l1的var，递归出来就是mergeTwoLists(l1, l2.next)
 */
public class MergeTwoLists021_01 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}
