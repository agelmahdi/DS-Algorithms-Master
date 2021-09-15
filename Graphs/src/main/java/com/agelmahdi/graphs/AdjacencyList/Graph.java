package com.agelmahdi.graphs.AdjacencyList;

import java.util.ArrayList;

public class Graph {
    private ArrayList<GraphNode> graphNodes = new ArrayList<>();

    public Graph(ArrayList<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public void addUndirectedEdge(int i, int j){
        GraphNode first = graphNodes.get(i);
        GraphNode second = graphNodes.get(j);
        first.getNeighbors().add(second);
        second.getNeighbors().add(first);

    }
    public void print() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < graphNodes.size(); i++) {
            s.append(graphNodes.get(i).getVertex() + ": ");

            for (int j = 0; j < graphNodes.get(i).getNeighbors().size(); j++) {
                if (j == graphNodes.get(i).getNeighbors().size() - 1) {
                    s.append(graphNodes.get(i).getNeighbors().get(j).getVertex());
                } else {
                    s.append(graphNodes.get(i).getNeighbors().get(j).getVertex() + " -> ");

                }

            }
            s.append("\n");
        }
        System.out.println(s.toString());
    }
}
