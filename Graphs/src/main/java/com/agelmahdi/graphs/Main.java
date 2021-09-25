package com.agelmahdi.graphs;

import com.agelmahdi.graphs.AdjacencyMatrix.Graph;
import com.agelmahdi.graphs.AdjacencyMatrix.GraphNode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<GraphNode> graphNodes = new ArrayList<>();

        graphNodes.add(new GraphNode("A", 0));
        graphNodes.add(new GraphNode("B", 1));
        graphNodes.add(new GraphNode("C", 2));
        graphNodes.add(new GraphNode("D", 3));
        graphNodes.add(new GraphNode("E", 4));
        graphNodes.add(new GraphNode("F", 5));
        graphNodes.add(new GraphNode("G", 6));
        graphNodes.add(new GraphNode("H", 7));
        graphNodes.add(new GraphNode("I", 8));
        graphNodes.add(new GraphNode("J", 9));

        Graph graph = new Graph(graphNodes);

        graph.addDirectedEdge(0,1);
        graph.addDirectedEdge(0,2);
        graph.addDirectedEdge(0,3);
        graph.addDirectedEdge(4,0);
        graph.addDirectedEdge(1,9);
        graph.addDirectedEdge(2,6);
        graph.addDirectedEdge(4,5);
        graph.addDirectedEdge(5,8);
        graph.addDirectedEdge(6,7);
        graph.addDirectedEdge(6,3);

        graph.print();



        graph.findDirectRoute(graphNodes.get(4),graphNodes.get(7));
        System.out.println();

//        System.out.println("\nSingle source shortest path");
//        graph.bfsForSSSPP(graphNodes.get(0));
//        System.out.println();

    }
}
