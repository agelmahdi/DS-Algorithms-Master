package com.agelmahdi.graphs.GraphAlgorithms;

import java.util.ArrayList;
import java.util.HashMap;

public class WeightedNode implements Comparable<WeightedNode>{
    private String vertex;
    private final ArrayList<WeightedNode> neighbors = new ArrayList<>();
    private final HashMap<WeightedNode, Integer> weightMap = new HashMap<>();
    private WeightedNode parent;
    private boolean isVisited;
    private int index;
    private int distance;
    private DisjointSet set;

    public WeightedNode(String vertex, int index){
        this.vertex = vertex;
        this.index = index;
        distance = Integer.MAX_VALUE;
    }


    public String getVertex() {
        return vertex;
    }

    public void setVertex(String vertex) {
        this.vertex = vertex;
    }

    public ArrayList<WeightedNode> getNeighbors() {
        return neighbors;
    }

    public void setNeighbor(WeightedNode neighbor) {
        this.neighbors.add(neighbor);
    }

    public HashMap<WeightedNode, Integer> getWeightMap() {
        return weightMap;
    }

    public void setWeightMap(WeightedNode weightMap, int weight) {
        this.weightMap.put(weightMap,weight);
    }

    public WeightedNode getParent() {
        return parent;
    }

    public void setParent(WeightedNode parent) {
        this.parent = parent;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public DisjointSet getSet() {
        return set;
    }

    public void set(DisjointSet set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return vertex;
    }

    @Override
        public int compareTo(WeightedNode weightedNode) {
        return this.distance - weightedNode.distance;
    }
}
