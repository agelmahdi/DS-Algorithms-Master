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


    public void bellmanFord(WeightedNode sourceNode) {
        sourceNode.setDistance(0);
        for (int i=0; i<weightedNodes.size(); i++) {
            for (WeightedNode currentNode : weightedNodes) {
                for (WeightedNode neighbor : currentNode.getNeighbors()) {
                    if(neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
                        neighbor.setDistance(currentNode.getDistance() + currentNode.getWeightMap().get(neighbor));
                        neighbor.setParent(currentNode);
                    }
                }
            }
        }
        System.out.println("Checking for Negative Cycle..");
        for (WeightedNode currentNode : weightedNodes) {
            for (WeightedNode neighbor : currentNode.getNeighbors() ) {
                if(neighbor.getDistance() > currentNode.getDistance() + currentNode.getWeightMap().get(neighbor)) {
                    System.out.println("Negative cycle found: \n");
                    System.out.println("Vertex name: " + neighbor.getVertex());
                    System.out.println("Old cost: " + neighbor.getDistance());
                    int newDistance = currentNode.getDistance() + currentNode.getWeightMap().get(neighbor);
                    System.out.println("new cost: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative Cycle not found");

        for (WeightedNode nodeToCheck : weightedNodes) {
            System.out.print("Node " +nodeToCheck+", distance: "+nodeToCheck.getDistance()+", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }


    }

}
