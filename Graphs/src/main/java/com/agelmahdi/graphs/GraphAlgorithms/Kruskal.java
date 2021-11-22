package com.agelmahdi.graphs.GraphAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    private ArrayList<WeightedNode> nodes = new ArrayList<>();
    private final ArrayList<UndirectedEdge> edges = new ArrayList<>();

    public Kruskal(ArrayList<WeightedNode> weightedNodes) {
        this.nodes = weightedNodes;
    }

    public void addWeightedUndirectedEdge(int firstIndex, int secondIndex, int weight) {
        UndirectedEdge edge = new UndirectedEdge(nodes.get(firstIndex), nodes.get(secondIndex), weight);
        WeightedNode first = edge.getFirst();
        WeightedNode second = edge.getSecond();
        first.setNeighbor(second);
        second.setNeighbor(first);
        first.setWeightMap(second, weight);
        second.setWeightMap(first, weight);
        edges.add(edge);
    }

    public void kruskal() {
        DisjointSet.makeSet(nodes);
        Comparator<UndirectedEdge> comparator = new Comparator<UndirectedEdge>() {
            @Override
            public int compare(UndirectedEdge t1, UndirectedEdge t2) {
                return t1.getWeight() - t2.getWeight();
            }
        };

        Collections.sort(edges, comparator);

        int cost = 0;
        for (UndirectedEdge edge : edges) {
            WeightedNode first = edge.getFirst();
            WeightedNode second = edge.getSecond();
            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += edge.getWeight();
                System.out.println(edge);
            }
        }
        System.out.println("Total cost = " + cost);
    }
}
