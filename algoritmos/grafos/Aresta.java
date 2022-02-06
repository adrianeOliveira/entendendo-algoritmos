package algoritmos.grafos;

import java.util.List;

class Aresta {
    List<Vertice> amigos;

    public Aresta(List<Vertice> amigos) {
        this.amigos = amigos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aresta aresta = (Aresta) o;

        return amigos.equals(aresta.amigos);
    }

    @Override
    public int hashCode() {
        return amigos.hashCode();
    }

    @Override
    public String toString() {
        return "Aresta{" +
                "amigos=" + amigos +
                '}';
    }
}
