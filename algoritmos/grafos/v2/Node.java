package algoritmos.grafos.v2;

public class Node {
    int value;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%d", value);
    }
}
