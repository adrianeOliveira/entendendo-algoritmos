package algoritmos.grafos.v2;

public class Main {

    public static void main(String[] args) {
        Node initialNode = buildEdges();
        printNodeChain(initialNode);

        Node actualNode = initialNode;
        Node nodeToFind = new Node(4);
        int attempts = 0;
        while (actualNode != null ) {
            System.out.printf("\nSearching node, attempt {%s}\n", attempts);
            if (actualNode.value == nodeToFind.value) {
                System.out.printf("\nNode {%s} found after {%s} attempts\n", actualNode, attempts);
                return;
            } else {
                actualNode = actualNode.nextNode;
                attempts++;
            }
        }
    }

    private static void printNodeChain(Node initialNode) {
        Node actualNode = initialNode;
        do {
            System.out.printf("%s -> ", actualNode);
            actualNode = actualNode.nextNode;
        }while (actualNode != null);
    }

    private static Node buildEdges() {
        Node first = new Node(1);
        Node sec = new Node(2);
        Node third = new Node(3);
        Node forth = new Node(4);
        Node fifth = new Node(5);
        Node sixth = new Node(6);

        first.nextNode = sec;
        sec.nextNode = third;
        third.nextNode = forth;
        forth.nextNode = fifth;
        fifth.nextNode = sixth;

        return first;
    }

}
