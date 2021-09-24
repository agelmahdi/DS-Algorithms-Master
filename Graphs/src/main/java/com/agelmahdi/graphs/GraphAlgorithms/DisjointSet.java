package com.agelmahdi.graphs.GraphAlgorithms;

import java.util.ArrayList;

public class DisjointSet {

    private ArrayList<WeightedNode> nodes = new ArrayList<>();


    public static void makeSet(ArrayList<WeightedNode> nodes) {
        for (WeightedNode node : nodes) {
            DisjointSet set = new DisjointSet();
            set.nodes.add(node);
            node.set(set);
        }
    }

    public static DisjointSet findSet(WeightedNode node) {
        return node.getSet();
    }

    public static DisjointSet union(WeightedNode n1, WeightedNode n2) {

        if (n1.getSet().equals(n2.getSet())) {
            return null;
        }

        DisjointSet set1 = n1.getSet();
        DisjointSet set2 = n2.getSet();

        if (set1.nodes.size() > set2.nodes.size()) {
            ArrayList<WeightedNode> nodesSet2 = set2.nodes;
            for (WeightedNode node : nodesSet2) {
                node.set(set1);
                set1.nodes.add(node);
            }
            return set1;
        } else {
            ArrayList<WeightedNode> nodesSet1 = set1.nodes;
            for (WeightedNode node : nodesSet1) {
                node.set(set2);
                set2.nodes.add(node);
            }
            return set2;
        }
    }

    public void printNodesOfSet() {

        for (WeightedNode node : nodes) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

}
