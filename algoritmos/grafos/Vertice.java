package algoritmos.grafos;

class Vertice {
    String nome;

    public Vertice(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertice amigo = (Vertice) o;

        return nome.equals(amigo.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
