package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

//    public static List<Integer> inorderTraversal(TreeNode root) {
//
//        List<Integer> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode cur = root;
//
//        while (cur != null || !stack.empty()){
//            if(cur !=null){
//                stack.push(cur);
//                cur= cur.left;
//            }else {
//                cur = stack.pop();
//                res.add(cur.val);
//                cur = cur.right;
//            }
//        }
//
//        return res;
//    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversal(root,res);
        return res;
    }

    private static void inorderTraversal(TreeNode node,List<Integer> list) {
        if(node != null){

            inorderTraversal(node.left, list);
            list.add(node.val);
            inorderTraversal(node.right, list);
        }
    }

    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,null,7};
        TreeNode root = ConstructTree.constructTree(nums);
        List<Integer> res =inorderTraversal(root);
        for (int num:res) {
            System.out.print(num+" ");
        }
    }




}
