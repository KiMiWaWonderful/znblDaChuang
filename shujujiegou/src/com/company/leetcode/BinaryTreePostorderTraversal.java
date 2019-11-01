package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postorderTraversal(root,res);
        return res;
    }

    private static void postorderTraversal(TreeNode node,List<Integer> list) {
        if(node != null){

            postorderTraversal(node.left, list);
            postorderTraversal(node.right, list);
            list.add(node.val);
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,null,7};
        TreeNode root = ConstructTree.constructTree(nums);
        List<Integer> res =postorderTraversal(root);
        for (int num:res) {
            System.out.print(num+" ");
        }
    }
}
