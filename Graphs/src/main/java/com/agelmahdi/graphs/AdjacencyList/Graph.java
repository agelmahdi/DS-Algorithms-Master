package com.agelmahdi.graphs.AdjacencyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private ArrayList<GraphNode> graphNodes = new ArrayList<>();

    public Graph(ArrayList<GraphNode> graphNodes) {
        this.graphNodes = graphNodes;
    }

    public void addUndirectedEdge(int i, int j) {
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

    private void visitedBFS(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode current = queue.remove();
            current.setBFSVisited(true);
            System.out.print(current.getVertex() + " ");

            for (GraphNode neighbor : current.getNeighbors()) {
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

            for (GraphNode neighbor : current.getNeighbors()) {
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
        GraphNode first = graphNodes.get(i);
        GraphNode second = graphNodes.get(j);
        first.getNeighbors().add(second);
    }

    private void topologicalVisited(GraphNode node, Stack<GraphNode> stack) {
        for (GraphNode neighbor : node.getNeighbors()) {
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
}
