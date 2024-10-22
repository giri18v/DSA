package com.dsa.tree;

import com.dsa.Recursion.BinarySearch;

public class MaxPathSum {

    static int max = Integer.MIN_VALUE;

    static TreeNode root ;
    public static void main(String[] args) {

         root =  insert(root,-10);
         root = insert(root,9);
        root = insert(root,20);
        root = insert(root,0);
        root = insert(root,0);
        root = insert(root,15);
        root = insert(root,7);
      max = maxPathSumHelper(root);

        System.out.println(max);





    }

    public static TreeNode insert(TreeNode root , int value) {
        if(root == null){
            return new TreeNode(value);
        }

        if(value < root.val){
            root.left = insert(root.left,value);
        }else if(value > root.val){
            root.right = insert(root.right,value);
        }

        return root;

    }



    public static int maxPathSumHelper(TreeNode root) {

        if(root == null){
            return 0;
        }

        int left = maxPathSumHelper(root.left);

        int right = maxPathSumHelper(root.right);

        left = Math.max(0,left);
        right = Math.max(0,right);

        int currSum = left+right+root.val;

        max = Math.max(max,currSum);

        return root.val+Math.max(left,right);



    }
}
