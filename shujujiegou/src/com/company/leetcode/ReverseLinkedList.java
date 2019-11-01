package com.company.leetcode;

public class ReverseLinkedList {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode createLinkedList(int[]arr,int n){
        if(n==0){
            return  null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode curNode = head;
        for (int i = 1; i <n ; i++) {
             curNode.next = new ListNode(arr[i]);
             curNode =  curNode.next;
        }
        return head;
    }

    public void printLinkedList(ListNode head){
        ListNode curNode = head;
        while (curNode != null){
            System.out.print(curNode.val+"->");
            curNode = curNode.next;
            }
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }
}
