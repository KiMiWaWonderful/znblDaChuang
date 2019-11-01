package com.company.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {



//    public  List<List<Integer>> levelOrder(TreeNode root) {
//
//        ArrayList<List<Integer>> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        LinkedList<Pair<TreeNode,Integer>> queue = new LinkedList<>();
//        queue.addLast(new Pair<>(root,0));
//
//        while (! queue.isEmpty()){
//            Pair<TreeNode,Integer> front = queue.removeFirst();
//            TreeNode node = front.getKey();
//            int level = front.getValue();
//
//            if(level == res.size()){
//                res.add(new ArrayList<>());
//            }
//
//            assert level<res.size();
//
//            res.get(level).add(node.val);
//            if(node.left != null){
//                queue.addLast(new Pair<>(node.left,level+1));
//            }
//            if(node.right != null){
//                queue.addLast(new Pair<>(node.right,level+1));
//            }
//        }
//
//        return res;
//    }

//    public static void main(String[] args) {
////        TreeNode treeNode = new TreeNode()
////        List<List<Integer>> res = levelOrder()
////
////    }

    public  static List<List<Integer>> levelOrder(TreeNode root) {

        ArrayList<List<Integer>> res = new ArrayList<>();//装下面循环得到的list
        if(root == null){
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();//存放每一层的节点,存放完后又移除
        queue.add(root);
        int levelNum = 1;

        while ( !queue.isEmpty()){
            int newLevelNum = 0;//统计层数
            ArrayList<Integer> level = new ArrayList<>();//存放每一层的节点
            //queue总比list事先存多一层
            for (int i = 0; i <levelNum ; i++) {
                TreeNode node = queue.remove();
                level.add(node.val);

                if(node.left != null){
                    queue.add(node.left);
                    newLevelNum++;
                }

                if(node.right != null){
                    queue.add(node.right);
                    newLevelNum++;
                }

            }
            res.add(level);
            levelNum = newLevelNum;
        }

        return res;
    }

//    public  static List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        if(root == null){
//            return res;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        int levelNum = 1;
//
//        while (!queue.isEmpty()){
//            int newLevelNum = 0;
//            List<Integer> list = new ArrayList<>();
//
//            for (int i = 0; i <levelNum ; i++) {
//                TreeNode node = queue.remove();
//                list.add(node.val);
//
//
//
//                if(node.left != null){
//                    queue.add(node.left);
//                    newLevelNum++;
//                }
//
//                if(node.right != null){
//                    queue.add(node.right);
//                    newLevelNum++;
//                }
//
//
//            }
//            res.add(list);
//            levelNum = newLevelNum;
//
//
//        }
//        return res;
//    }
    public static void main(String[] args) {
        Integer[] nums = {3,9,20,null,null,15,7};
        TreeNode root = ConstructTree.constructTree(nums);
        List<List<Integer>> res =levelOrder(root);

    }
}
