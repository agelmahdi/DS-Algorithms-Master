package com.agelmahdi.graphs.GraphAlgorithms;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims {
    private ArrayList<WeightedNode> nodes = new ArrayList<>();

    public Prims(ArrayList<WeightedNode> weightedNodes) {
        this.nodes = weightedNodes;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodes.get(firstIndex), nodes.get(secondIndex), weight);
        WeightedNode first = edge.getFirst();
        WeightedNode second = edge.getSecond();
        first.setNeighbor(second);
        second.setNeighbor(first);
        first.setWeightMap(second, weight);
        second.setWeightMap(first, weight);
    }

    public void prims(WeightedNode source) {
        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).setDistance(Integer.MAX_VALUE);
        }
        source.setDistance(0);

        PriorityQueue<WeightedNode> queue = new PriorityQueue<>();
        queue.addAll(nodes);
        while (!queue.isEmpty()){
            WeightedNode current = queue.remove();
            for (WeightedNode neighbor : current.getNeighbors()){
                if (queue.contains(neighbor)){
                    if (neighbor.getDistance() > current.getWeightMap().get(neighbor)){
                        neighbor.setDistance(current.getWeightMap().get(neighbor));
                        neighbor.setParent(current);
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        int cost =0;
        for (WeightedNode node : nodes){
            System.out.println("Node: "+node+ ", Key " + node.getDistance()+" Parent "+ node.getParent());
            cost+= node.getDistance();
        }

        System.out.println("\nTotal cost of MST= "+cost);
    }
}
