package algoritmos.grafos.v2;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(buildEdges());

        System.out.printf("%s", graph);

        findNode(graph, new Node(6));
    }

    private static void findNode(Graph graph, Node nodeToFind) {
        Edge[] edges = graph.edges;
        int[] verifiedNodes = new int[edges.length];
        int verifiedNodeIndex = 0;
        for (int i = 0; i < edges.length; i++) {
            if (!containsNode(verifiedNodes, edges[i].actualNode)) {
                if (edges[i].actualNode.value == nodeToFind.value) {
                    System.out.printf("Node %s found at attempt %d", edges[i].actualNode, i);
                    return;
                }else {
                    verifiedNodes[verifiedNodeIndex++] = edges[i].actualNode.value;

                }
            }
        }
    }

    private static boolean containsNode(int[] verifiedNodes, Node node) {
        for (int i = 0; i < verifiedNodes.length; i++) {
            if (verifiedNodes[i] == node.value) {
                return true;
            }
        }
        return false;
    }

    private static Edge[] buildEdges() {
        Node[] nodes = new Node[]{
                new Node(1),
                new Node(2),
                new Node(3),
                new Node(4),
                new Node(5),
                new Node(6)
        };

        Edge[] edges = new Edge[]{
                new Edge(nodes[0], nodes[4]),
                new Edge(nodes[0], nodes[1]),
                new Edge(nodes[4], nodes[3]),
                new Edge(nodes[1], nodes[2]),
                new Edge(nodes[4], nodes[1]),
                new Edge(nodes[3], nodes[2]),
                new Edge(nodes[3], nodes[5])
        };
        return edges;
    }
}
