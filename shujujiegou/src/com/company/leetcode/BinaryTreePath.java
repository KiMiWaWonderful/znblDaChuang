package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> res = new ArrayList<>();

        if(root == null ){
            return res;
        }

        if(root.left == null && root.right == null){
            res.add(Integer.toString(root.val));
            return res;
        }

        List<String> leftS = binaryTreePaths(root.left);
//        for (int i = 0; i <leftS.size() ; i++) {
////            res.add(Integer.toString(root.val) + "->" + leftS[i]);
////        }

        for (String s:leftS) {
            res.add(Integer.toString(root.val) + "->" + s);
        }

        List<String> rightS = binaryTreePaths(root.right);

        for (String s:rightS) {
            res.add(Integer.toString(root.val) + "->" + s);
        }

        return res;

    }
}
