package algoritmos.grafos;

import java.util.Queue;

public class PesquisaLargura {

    public static void main(String[] args) {
        Grafo grafo = new Grafo.Builder().construirGrafo();
        encontrarAmigoComLetraM(grafo);
    }

    public  static void encontrarAmigoComLetraM(Grafo grafo) {
        Queue<String> amigos = grafo.vizinhos.get("adriane");
        System.out.printf("Vizinhos: %s\n", amigos);
        do {
            String amigo = amigos.poll();
            if (!grafo.pessoasVerificadas.contains(amigo)) {
                if (grafo.nomeComecaComM(amigo)) {
                    System.out.printf("Amigo %s começa com a letra M\n", amigo);
                    return;
                } else {
                    grafo.pessoasVerificadas.add(amigo);
                    Queue<String> vizinhosDeAmigo = grafo.vizinhos.get(amigo);
                    if (!vizinhosDeAmigo.isEmpty()) {
                        System.out.printf("Amigo %s, não começa com a letra M\nAdicionando seus amigos {%s} a lista de vizinhos...\n", amigo, vizinhosDeAmigo);
                        amigos.addAll(vizinhosDeAmigo);
                    } else {
                        System.out.printf("Amigo %s não possui vizinhos\n", amigo);
                    }
                    System.out.printf("Vizinhos: %s\n", amigos);
                }
            } else {
                System.out.printf("Amigo %s ja verificado\n", amigo);
            }
        } while (!amigos.isEmpty());
    }

}

