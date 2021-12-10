package com.agelmahdi.binarytree.CodeChallenge;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxDepthRec(root, 1);
    }

    private int maxDepthRec(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }

        int right = maxDepthRec(root.right, depth + 1);
        int left = maxDepthRec(root.left, depth + 1);

        return Math.max(Math.max(right, left), depth);
    }
}
