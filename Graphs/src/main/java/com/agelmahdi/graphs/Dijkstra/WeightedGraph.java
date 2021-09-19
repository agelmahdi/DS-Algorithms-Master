package com.agelmahdi.graphs.Dijkstra;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class WeightedGraph {
    private ArrayList<WeightedNode> weightedNodes;

    public WeightedGraph(ArrayList<WeightedNode> weightedNodes) {
        this.weightedNodes = weightedNodes;
    }

    public void addWeightedNode(int i, int j, int weight) {
        WeightedNode first = weightedNodes.get(i);
        WeightedNode second = weightedNodes.get(j);
        first.setNeighbor(second);
        first.setWeightMap(second, weight);

    }

    // Time Complexity O((V+E) Log(v))
    // Space Complexity O(V+E)

    public void dijkstra(WeightedNode node) {

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>(weightedNodes);//--------> O(n log(n))
        node.setDistance(0);
        while (!queue.isEmpty()) {
            WeightedNode current = queue.remove();
            for (WeightedNode neighbor : current.getNeighbors()) {
                if (queue.contains(neighbor)) {
                    if (neighbor.getDistance() > current.getDistance() + current.getWeightMap().get(neighbor)) {
                        neighbor.setDistance(current.getDistance() + current.getWeightMap().get(neighbor));
                        neighbor.setParent(current);
                        // update queue
                        queue.remove(neighbor);//--------> O(E log(E))
                        queue.add(neighbor);
                    }

                }
            }

        }

        for (WeightedNode nodeToCheck : weightedNodes) {
            System.out.print("Node " + nodeToCheck + ", Distance: " + nodeToCheck.getDistance() + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }

    }

    private void pathPrint(WeightedNode node) {
        if (node.getParent() != null) {
            pathPrint(node.getParent());
        }

        System.out.print(node.getVertex() + " ");

    }

}
