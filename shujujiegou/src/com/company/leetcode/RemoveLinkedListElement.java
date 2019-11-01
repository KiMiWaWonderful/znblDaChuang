package com.company.leetcode;

public class RemoveLinkedListElement {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {



//        while (head != null && head.val == val){
//            ListNode delNode = head;
//            head = delNode.next;
//            delNode.next = null;
//        }
//
//        if(head == null){
//            return null;
//        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        //ListNode cur = head;
        ListNode cur = dummyHead;
        while (cur.next!=null){
            if(cur.next.val == val){
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;

            }else{
                cur = cur.next;
            }
        }

        ListNode retNode = dummyHead.next;
        dummyHead.next = null;
        return retNode;
    }
}
