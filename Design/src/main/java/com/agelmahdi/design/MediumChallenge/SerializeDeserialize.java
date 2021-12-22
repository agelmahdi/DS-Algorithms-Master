package com.agelmahdi.design.MediumChallenge;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class SerializeDeserialize {

    /*
    * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer,
    * or transmitted across a network connection link to be reconstructed later in the same or another computer environment.
    *
    * Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your serialization/deserialization algorithm should work.
    * You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized to the original tree structure.
    * */

    public static void main(String[] args) {

       TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(5)));
        SerializeDeserialize ser = new SerializeDeserialize();
        SerializeDeserialize deser = new SerializeDeserialize();
        TreeNode ans = deser.deserialize(ser.serialize(root));
    }

    private static final String spliter = ",";
    private static final String NN = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            buildString(node.left, sb);
            buildString(node.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.parseInt(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}