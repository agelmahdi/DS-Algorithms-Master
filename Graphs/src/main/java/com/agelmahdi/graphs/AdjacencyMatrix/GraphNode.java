package com.agelmahdi.graphs.AdjacencyMatrix;

public class GraphNode {
    private String vertex;
    private int index;
    private boolean isVisited;

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

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
