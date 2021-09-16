package com.agelmahdi.graphs.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private ArrayList<GraphNode> graphNodes = new ArrayList<>();
    private int[][] adjacentMatrix;

    public Graph(ArrayList<GraphNode> graphNodes) {
        int size = graphNodes.size();
        this.graphNodes = graphNodes;
        adjacentMatrix = new int[size][size];
    }

    public void addUndirectedEdge(int i, int j) {
        adjacentMatrix[i][j] = 1;
        adjacentMatrix[j][i] = 1;
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

    private ArrayList<GraphNode> getNeighbors(GraphNode graphNode) {
        ArrayList<GraphNode> neighbors = new ArrayList<>();
        int index = graphNode.getIndex();

        for (int i = 0; i < adjacentMatrix.length; i++) {
            if (adjacentMatrix[index][i] == 1) {
                neighbors.add(graphNodes.get(i));
            }
        }

        return neighbors;

    }

    private void visitedDFS(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            current.setVisited(true);
            System.out.print(current.getVertex() + " ");

            for (GraphNode neighbor : getNeighbors(current)) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                    neighbor.setVisited(true);
                }
            }
        }
    }

    public void breadthFirstSearch() {
        for (GraphNode graphNode : graphNodes) {
            if (!graphNode.isVisited()) {
                visitedDFS(graphNode);
            }
        }
    }
}
