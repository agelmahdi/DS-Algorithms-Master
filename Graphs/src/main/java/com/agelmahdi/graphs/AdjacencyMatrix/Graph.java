package com.agelmahdi.graphs.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<GraphNode> graphNodes = new ArrayList<>();
    private int[][] adjacentMatrix;

    public Graph(ArrayList<GraphNode> graphNodes){
        int size = graphNodes.size();
        this.graphNodes = graphNodes;
        adjacentMatrix = new int[size][size];
    }

    public void addUndirectedEdge(int i, int j){
        adjacentMatrix[i][j] =1;
        adjacentMatrix[j][i] =1;
    }

    public void print() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (int i = 0; i < graphNodes.size(); i++) {
            s.append(graphNodes.get(i).getVertex() + " ");
        }
        s.append("\n");
        for (int i = 0; i < graphNodes.size(); i++) {
            s.append(graphNodes.get(i).getVertex() + ": ");
            for (int j : adjacentMatrix[i]) {
                s.append((j) + " ");
            }
            s.append("\n");
        }
        System.out.println(s.toString());
    }
}
