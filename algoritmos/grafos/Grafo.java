package algoritmos.grafos;

import java.util.Map;
import java.util.Queue;

public class Grafo {

    Map<String, Queue<String>> vizinhos;

    public Grafo(Map<String, Queue<String>> vizinhos) {
        this.vizinhos = vizinhos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grafo grafo = (Grafo) o;

        return vizinhos.equals(grafo.vizinhos);
    }

    @Override
    public int hashCode() {
        return vizinhos.hashCode();
    }

    @Override
    public String toString() {
        return "Grafo{" +
                "vizinhos=" + vizinhos +
                '}';
    }
}
