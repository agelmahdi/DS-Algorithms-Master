package com.agelmahdi.graphs.Dijkstra;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> weightedNodes = new ArrayList<>();
        weightedNodes.add(new WeightedNode("A",0));
        weightedNodes.add(new WeightedNode("B",1));
        weightedNodes.add(new WeightedNode("C",2));
        weightedNodes.add(new WeightedNode("D",3));
        weightedNodes.add(new WeightedNode("E",4));
        weightedNodes.add(new WeightedNode("F",5));
        weightedNodes.add(new WeightedNode("G",6));

        WeightedGraph weightedGraph = new WeightedGraph(weightedNodes);
        weightedGraph.addWeightedNode(0,1,2);
        weightedGraph.addWeightedNode(0,2,5);
        weightedGraph.addWeightedNode(1,2,6);
        weightedGraph.addWeightedNode(1,3,1);
        weightedGraph.addWeightedNode(1,4,3);
        weightedGraph.addWeightedNode(2,5,8);
        weightedGraph.addWeightedNode(3,4,4);
        weightedGraph.addWeightedNode(4,6,9);
        weightedGraph.addWeightedNode(5,6,7);

        weightedGraph.bellmanFord(weightedNodes.get(0));
    }
}
