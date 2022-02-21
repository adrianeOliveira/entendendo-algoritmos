package algoritmos.grafos;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Arrays.asList;

public class Grafo {

    Hashtable<String, Queue<String>> vizinhos;

    List<String> pessoasVerificadas;

    public Grafo(Hashtable<String, Queue<String>> vizinhos) {
        this.vizinhos = vizinhos;
        pessoasVerificadas = new ArrayList<>();
    }

    public boolean nomeComecaComM(String nome) {
        return nome.startsWith("M") || nome.startsWith("m");
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

    static class Builder {

        public Grafo construirGrafo() {
            String claire = "claire";
            String gustavo = "gustavo";
            String gabriel = "mgabriel";
            String beatriz = "beatriz";
            String felipe = "felipe";
            String adriane = "adriane";

            Hashtable<String, Queue<String>> hashtable = new Hashtable<>(
                    Map.of(adriane, new PriorityQueue<>(asList(claire, beatriz, felipe)),
                            felipe, new PriorityQueue<>(asList(gabriel, beatriz)),
                            gabriel, new PriorityQueue<>(),
                            beatriz, new PriorityQueue<>(asList(gustavo)),
                            gustavo, new PriorityQueue<>(),
                            claire, new PriorityQueue<>())
            );
            return new Grafo(hashtable);
        }

    }

}
