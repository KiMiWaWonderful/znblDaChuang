package com.company.leetcode;

public class DeleteNodeInALinkedList {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public void deleteNode(ListNode node) {
        if(node == null || node.next == null)
            throw new IllegalArgumentException("node should be valid and can not be the tail node.");

       node.val = node.next.val;
        node.next = node.next.next;
    }
}
