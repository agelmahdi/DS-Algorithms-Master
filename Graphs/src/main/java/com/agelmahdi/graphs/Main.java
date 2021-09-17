package com.agelmahdi.graphs;

import com.agelmahdi.graphs.AdjacencyMatrix.Graph;
import com.agelmahdi.graphs.AdjacencyMatrix.GraphNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();

        graphNodes.add(new GraphNode("A",0));
        graphNodes.add(new GraphNode("B",1));
        graphNodes.add(new GraphNode("C",2));
        graphNodes.add(new GraphNode("D",3));
        graphNodes.add(new GraphNode("E",4));
        graphNodes.add(new GraphNode("F",5));
        graphNodes.add(new GraphNode("G",6));
        graphNodes.add(new GraphNode("H",7));

        Graph graph = new Graph(graphNodes);

        graph.addDirectedEdge(0,2);
        graph.addDirectedEdge(2,4);
        graph.addDirectedEdge(4,7);
        graph.addDirectedEdge(4,5);
        graph.addDirectedEdge(5,6);
        graph.addDirectedEdge(1,2);
        graph.addDirectedEdge(1,3);
        graph.addDirectedEdge(3,5);

        graph.print();

        System.out.println("\nBreadth first search");
        graph.breadthFirstSearch();
        System.out.println();

        System.out.println("\nDepth first search");
        graph.depthFirstSearch();
        System.out.println();

        System.out.println("\nTopological sort");
        graph.topologicalSort();
        System.out.println();

    }
}
