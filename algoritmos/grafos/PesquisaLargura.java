package algoritmos.grafos;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Arrays.asList;

public class PesquisaLargura {

    public static void main(String[] args) {
        Grafo grafo = construirGrafo();
        Queue<String> amigos = grafo.vizinhos.get("adriane");

        do {
            String amigo = amigos.poll();
            if (amigoEvendedor(amigo)) {
                System.out.printf("Amigo %s começa com a letra M\n", amigo);
                return;
            } else {
                amigos.addAll(grafo.vizinhos.get(amigo));
            }
        } while (!amigos.isEmpty());
    }

    private static Grafo construirGrafo() {
        String claire = "claire";
        String gustavo = "gustavo";
        String gabriel = "mgabriel";
        String beatriz = "Mbeatriz";
        String felipe = "felipe";
        String adriane = "adriane";

        Map<String, Queue<String>> map = Map.of(adriane, new PriorityQueue<>(asList(claire, beatriz, felipe)),
                felipe, new PriorityQueue<>(asList(gabriel)),
                gabriel, new PriorityQueue<>(),
                beatriz, new PriorityQueue<>(asList(gustavo)),
                gustavo, new PriorityQueue<>(),
                claire, new PriorityQueue<>()
        );
        return new Grafo(map);
    }

    private static boolean amigoEvendedor(String nome) {
        return nome.startsWith("M") || nome.startsWith("m");
    }

}

