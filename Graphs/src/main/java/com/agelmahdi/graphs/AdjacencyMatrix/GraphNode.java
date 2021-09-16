package com.agelmahdi.graphs.AdjacencyMatrix;

public class GraphNode {
    private String vertex;
    private int index;
    private boolean isBFSVisited;
    private boolean isDFSVisited;

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
