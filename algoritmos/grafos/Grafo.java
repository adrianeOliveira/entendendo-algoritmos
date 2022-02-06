package algoritmos.grafos;

import java.util.Map;

public class Grafo {

    Map<Vertice, Aresta> amigosAdjascentes;

    public Grafo(Vertice vertice, Aresta aresta) {
        this.amigosAdjascentes = Map.of(vertice, aresta);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grafo grafo = (Grafo) o;

        return amigosAdjascentes.equals(grafo.amigosAdjascentes);
    }

    @Override
    public int hashCode() {
        return amigosAdjascentes.hashCode();
    }

    @Override
    public String toString() {
        return "Grafo{" +
                "amigosAdjascentes=" + amigosAdjascentes +
                '}';
    }
}
