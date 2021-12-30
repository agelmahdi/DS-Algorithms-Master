package com.agelmahdi.binarytree.MediumChallenge;

import com.agelmahdi.binarytree.BinaryTreeLinkedList.Node;
import com.agelmahdi.binarytree.CodeChallenge.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> currentLevel = new LinkedList<>();
        Queue<TreeNode> nextLevel = new LinkedList<>();
        currentLevel.add(root);
        List<List<Integer>> list = new ArrayList<>();
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            TreeNode node = currentLevel.remove();

            System.out.print(node.val + " ");

            if (leftToRight){
                if (node.left != null) {
                    nextLevel.add(node.left);
                }
                if (node.right != null) {
                    nextLevel.add(node.right);
                }

            }
            else {
                if (node.right != null) {
                    nextLevel.add(node.right);
                }

                if (node.left != null) {
                    nextLevel.add(node.left);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Queue<TreeNode> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }

        }

        return list;
    }
}
