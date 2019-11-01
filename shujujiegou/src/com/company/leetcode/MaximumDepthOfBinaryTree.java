package com.company.leetcode;

public class MaximumDepthOfBinaryTree {

    public static int maxDepth(TreeNode root) {

        if(root == null){
            return  0 ;
        }

        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5,null,7};
        TreeNode root = ConstructTree.constructTree(nums);
        int dept = maxDepth(root);
        System.out.println(dept);
    }
}
