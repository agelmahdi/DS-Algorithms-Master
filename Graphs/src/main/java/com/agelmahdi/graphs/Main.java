package com.agelmahdi.graphs;

import com.agelmahdi.graphs.AdjacencyList.Graph;
import com.agelmahdi.graphs.AdjacencyList.GraphNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();

        graphNodes.add(new GraphNode("A",0));
        graphNodes.add(new GraphNode("B",1));
        graphNodes.add(new GraphNode("C",2));
        graphNodes.add(new GraphNode("D",3));
        graphNodes.add(new GraphNode("E",4));

        Graph graph = new Graph(graphNodes);

        graph.addUndirectedEdge(0,1);
        graph.addUndirectedEdge(0,2);
        graph.addUndirectedEdge(0,3);
        graph.addUndirectedEdge(1,4);
        graph.addUndirectedEdge(2,3);
        graph.addUndirectedEdge(3,4);

        graph.print();
        System.out.println("\nBreadth first search");
        graph.breadthFirstSearch();
        System.out.println();

        System.out.println("\nDepth first search");
        graph.depthFirstSearch();
    }
}