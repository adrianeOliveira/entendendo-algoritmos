package algoritmos.grafos.v2;

public class Edge {

    Node actualNode;
    Node nextNode;

    public Edge(Node actualNode, Node nextNode) {
        this.actualNode = actualNode;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", actualNode, nextNode);
    }
}
