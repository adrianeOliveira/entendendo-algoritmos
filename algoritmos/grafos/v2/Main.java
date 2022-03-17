package algoritmos.grafos.v2;

public class Main {
    public static void main(String[] args) {
        Node[] node = new Node[]{
                new Node(1),
                new Node(2),
                new Node(3),
                new Node(4),
                new Node(5),
                new Node(6)
        };

        Edge[] edges = new Edge[]{
                new Edge(node[0], node[4]),
                new Edge(node[0], node[1]),
                new Edge(node[4], node[3]),
                new Edge(node[1], node[2]),
                new Edge(node[4], node[1]),
                new Edge(node[3], node[2]),
                new Edge(node[3], node[5])
        };

        Graph graph = new Graph(edges);

        System.out.printf("%s", graph);
    }
}
