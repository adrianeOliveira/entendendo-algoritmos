package algoritmos.grafos;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.util.Collections.emptyList;

public class PesquisaLargura {

    public static void main(String[] args) {
        String nome = "adriane";
        Queue<String> amigosList = new PriorityQueue<>();
        amigosList.add("felipe");
        amigosList.add("daniela");
        amigosList.add("pantera");

        while (!amigosList.isEmpty()) {
            String amigo = amigosList.poll();
            if (amigoEvendedor(amigo)) {
                System.out.printf("Amigo %s começa com a letra M\n", amigo);
                return;
            } else {
                amigosList.add(grafo.get(nome));
            }
        }
    }

    private static void construirGrafo() {
        Vertice claire = new Vertice("claire");
        Aresta amigosClaire = new Aresta(emptyList());

        Vertice gustavo = new Vertice("gustavo");
        Aresta amigosGustavo = new Aresta(emptyList());

        Vertice gabriel = new Vertice("gabriel");
        Aresta amigosGabriel = new Aresta(emptyList());

        Vertice beatriz = new Vertice("beatriz");
        Aresta amigosBeatriz = new Aresta(List.of(gustavo));

        Vertice felipe = new Vertice("felipe");
        Aresta amigosFelipe = new Aresta(List.of(gabriel));


        Vertice adriane = new Vertice("adriane");
        Aresta amigosAdriane = new Aresta(List.of(beatriz, felipe, claire));

    }

    private static boolean amigoEvendedor(String amigo) {
        return amigo.startsWith("M") || amigo.startsWith("m");
    }

}

