package com.agelmahdi.graphs.GraphAlgorithms;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> weightedNodes = new ArrayList<>();
        weightedNodes.add(new WeightedNode("A",0));
        weightedNodes.add(new WeightedNode("B",1));
        weightedNodes.add(new WeightedNode("C",2));
        weightedNodes.add(new WeightedNode("D",3));
//        weightedNodes.add(new WeightedNode("E",4));
//        weightedNodes.add(new WeightedNode("F",5));
//        weightedNodes.add(new WeightedNode("G",6));

        WeightedGraph weightedGraph = new WeightedGraph(weightedNodes);
        weightedGraph.addWeightedNode(0,3,1);
        weightedGraph.addWeightedNode(0,1,8);
        weightedGraph.addWeightedNode(1,2,1);
        weightedGraph.addWeightedNode(2,0,4);
        weightedGraph.addWeightedNode(3,1,2);
        weightedGraph.addWeightedNode(3,2,9);
//        weightedGraph.addWeightedNode(3,4,4);
//        weightedGraph.addWeightedNode(4,6,9);
//        weightedGraph.addWeightedNode(5,6,7);

       // weightedGraph.floydWarshall();


        ArrayList<WeightedNode> nodes = new ArrayList<>();

        nodes.add(new WeightedNode("A",0));
        nodes.add(new WeightedNode("B",1));
        nodes.add(new WeightedNode("C",2));
        nodes.add(new WeightedNode("D",3));
        nodes.add(new WeightedNode("E",4));

        Prims prims = new Prims(nodes);
        prims.addWeightedUndirectedEdge(0,1,5);
        prims.addWeightedUndirectedEdge(0,2,13);
        prims.addWeightedUndirectedEdge(0,4,15);
        prims.addWeightedUndirectedEdge(1,2,10);
        prims.addWeightedUndirectedEdge(1,3,8);
        prims.addWeightedUndirectedEdge(2,3,6);
        prims.addWeightedUndirectedEdge(2,4,20);

        prims.prims(nodes.get(0));



    }
}
