package com.agelmahdi.graphs.AdjacencyList;

import java.util.ArrayList;

public class GraphNode {
    private final String vertex;
    private final int index;
    private boolean isBFSVisited;
    private boolean isDFSVisited;
    private boolean isTopoVisited;
    private boolean isSSSPVisited;
    private GraphNode parent;

    private final ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String vertex, int index) {
        this.index = index;
        this.vertex = vertex;
    }

    public String getVertex() {
        return vertex;
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<GraphNode> getNeighbors() {
        return neighbors;
    }

    public boolean isBFSVisited() {
        return isBFSVisited;
    }

    public void setBFSVisited(boolean BFSVisited) {
        isBFSVisited = BFSVisited;
    }

    public boolean isDFSVisited() {
        return isDFSVisited;
    }

    public void setDFSVisited(boolean DFSVisited) {
        isDFSVisited = DFSVisited;
    }

    public boolean isTopoVisited() {
        return isTopoVisited;
    }

    public GraphNode getParent() {
        return parent;
    }

    public void setParent(GraphNode parent) {
        this.parent = parent;
    }

    public boolean isSSSPVisited() {
        return isSSSPVisited;
    }

    public void setSSSPVisited(boolean SSSPVisited) {
        isSSSPVisited = SSSPVisited;
    }

    public void setTopoVisited(boolean topoVisited) {
        isTopoVisited = topoVisited;
    }
}
