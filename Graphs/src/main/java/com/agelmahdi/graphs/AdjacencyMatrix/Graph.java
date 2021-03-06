package com.agelmahdi.graphs.AdjacencyMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private ArrayList<GraphNode> graphNodes = new ArrayList<>();
    private final int[][] adjacentMatrix;

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

    private void visitedBFS(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            current.setBFSVisited(true);
            System.out.print(current.getVertex() + " ");

            for (GraphNode neighbor : getNeighbors(current)) {
                if (!neighbor.isBFSVisited()) {
                    queue.add(neighbor);
                    neighbor.setBFSVisited(true);
                }
            }
        }
    }

    public void breadthFirstSearch() {
        for (GraphNode graphNode : graphNodes) {
            if (!graphNode.isBFSVisited()) {
                visitedBFS(graphNode);
            }
        }
    }

    private void visitedDFS(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            GraphNode current = stack.pop();
            current.setDFSVisited(true);
            System.out.print(current.getVertex() + " ");

            for (GraphNode neighbor : getNeighbors(current)) {
                if (!neighbor.isDFSVisited()) {
                    stack.push(neighbor);
                    neighbor.setDFSVisited(true);
                }
            }
        }
    }

    public void depthFirstSearch() {
        for (GraphNode graphNode : graphNodes) {
            if (!graphNode.isDFSVisited()) {
                visitedDFS(graphNode);
            }
        }
    }

    // Topological sort
    public void addDirectedEdge(int i, int j) {
        adjacentMatrix[i][j] = 1;
    }


    private void topologicalVisited(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbor : getNeighbors(node)) {
            if (!neighbor.isTopoVisited()) {
                topologicalVisited(neighbor, stack);
            }
        }
        node.setTopoVisited(true);
        stack.push(node);

    }

    public void topologicalSort() {
        Stack<GraphNode> stack = new Stack<>();
        for (GraphNode node : graphNodes) {
            if (!node.isTopoVisited()) {
                topologicalVisited(node, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().getVertex() + " ");
        }

    }

    // Single source shortest path problem

    private void pathPrint(GraphNode graphNode) {
        if (graphNode.getParent() != null) {
            pathPrint(graphNode.getParent());
        }
        System.out.print(graphNode.getVertex() + " ");
    }

    // Breadth first search solution
    public void bfsForSSSPP(GraphNode graphNode) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(graphNode);
        while (!queue.isEmpty()) {

            GraphNode current = queue.remove();
            current.setSSSPVisited(true);

            System.out.print("Path for vertex " + current.getVertex() + ": ");
            pathPrint(current);
            System.out.println();

            for (GraphNode neighbor : getNeighbors(current)) {
                if (!neighbor.isSSSPVisited()) {
                    queue.add(neighbor);
                    neighbor.setSSSPVisited(true);
                    neighbor.setParent(current);
                }
            }
        }

    }

    public void findDirectRoute(GraphNode source, GraphNode destination) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(source);
        GraphNode current = null;
        while (!queue.isEmpty()) {
            current = queue.remove();
            current.setSSSPVisited(true);
            if (current == destination) {
                System.out.print("Route found: ");
                pathPrint(current);
                System.out.println();
                break;
            }

            for (GraphNode neighbor : getNeighbors(current)) {
                if (!neighbor.isSSSPVisited()) {
                    queue.add(neighbor);
                    neighbor.setSSSPVisited(true);
                    neighbor.setParent(current);
                }
            }
        }
        if (current != null && current != destination) {
            System.out.println("route not found");
        }

    }


    public boolean isDirectNodeFound(int i, int j) {
        return adjacentMatrix[i][j] == 1;
    }
}
