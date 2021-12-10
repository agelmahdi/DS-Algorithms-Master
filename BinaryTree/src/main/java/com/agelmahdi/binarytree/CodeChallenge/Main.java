package com.agelmahdi.binarytree.CodeChallenge;

import com.agelmahdi.binarytree.BinaryTreeArray.BinaryTree;

public class Main {
    public static void main(String[] args) {
//        TreeNode root;
//        root = new TreeNode(3,
//                new TreeNode(9),
//                new TreeNode(20,
//                        new TreeNode(15),
//                        new TreeNode(7)));
//
//        MaximumDepthofBinaryTree max = new MaximumDepthofBinaryTree();
//        System.out.println(max.maxDepth(root));

        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4,
                        new TreeNode(3),
                        new TreeNode(6)));

        TreeNode root2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        System.out.println(ValidateBinarySearchTree.isValidBST(root2));

    }
}
