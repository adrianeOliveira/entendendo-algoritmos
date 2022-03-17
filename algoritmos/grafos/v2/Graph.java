package algoritmos.grafos.v2;

import java.util.Arrays;

public class Graph {
    Edge[] edges;

    public Graph(Edge[] edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return String.format("%s", Arrays.toString(edges));
    }
}
