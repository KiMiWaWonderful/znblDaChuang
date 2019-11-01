package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

//    public static class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//      TreeNode(int x) { val = x; }
//  }

//  public  class Command{
//        String s;
//        TreeNode node;
//        Command(String s,TreeNode node){
//            this.s = s;
//            this.node = node;
//        }
//  }

//    public  List<Integer> preorderTraversal(TreeNode root) {
//
//        List<Integer> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//        Stack<Command> stack = new Stack<>();
//        stack.push(new Command("go",root));
//
//        while ( !stack.empty()){
//            Command command = stack.pop();
//
//            if(command.s == "print"){
//                 res.add(command.node.val);
//            }else {
//                assert (command.s == "go");
//                if(command.node.right != null){
//                    stack.push(new Command("go",command.node.right));
//                }
//                if(command.node.left != null){//不能是else if
//                    stack.push(new Command("go",command.node.left));
//                }
//                stack.push(new Command("print",command.node));
//            }
//        }
//
//        return res;
//
//    }

//    public static List<Integer> preorderTraversal(TreeNode root) {
////        List<Integer> res = new ArrayList<>();
////        if(root == null){
////            return res;
////        }
////
////        Stack<TreeNode> stack = new Stack<>();
////        TreeNode cur = root;
////        while (cur != null || !stack.empty()){
////            if(cur !=null){
////                res.add(cur.val);
////                stack.push(cur);
////                cur= cur.left;
////            }else {
////                cur = stack.pop();
////                cur = cur.right;
////            }
////        }
////
////        return res;
////    }

//    public List<Integer> preorderTraversal(TreeNode root) {
//
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(root == null)
//            return res;
//
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//
//        while (!stack.empty()){
//            TreeNode curNode = stack.pop();
//            res.add(curNode.val);
//
//            if(curNode.right != null){
//                stack.push(curNode.right);
//            }
//
//            if(curNode.left != null){
//                stack.push(curNode.left);
//            }
//        }
//
//        return res;
//    }

    public static List<Integer> preorderTraversal(TreeNode root) {
//        ArrayList<Integer> res = new ArrayList<Integer>();
//        if(root == null)
//            return res;
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
//        return res;

        ArrayList<Integer> res = new ArrayList<Integer>();
        preorderTraversal(root, res);
        return res;
    }

    private static void preorderTraversal(TreeNode node, List<Integer> list){
        if(node != null){
            list.add(node.val);
            preorderTraversal(node.left, list);
            preorderTraversal(node.right, list);
        }
    }

    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,null,7};
        TreeNode root = ConstructTree.constructTree(nums);
        List<Integer> res = preorderTraversal(root);
        for (int num:res) {
            System.out.print(num+" ");
        }

    }
}

