package com.agelmahdi.graphs.AdjacencyList;

import java.util.ArrayList;

public class GraphNode {
    private String vertex;
    private int index;
    private boolean isBFSVisited;
    private boolean isDFSVisited;
    private ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String vertex,int index){
        this.index = index;
        this.vertex =vertex;
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
}
