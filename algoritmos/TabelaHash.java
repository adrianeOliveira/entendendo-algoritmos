package algoritmos;

public class TabelaHash {

    public static void main(String[] args) {
        Tabela tabela = new Tabela(10);
        tabela.addLista("maçã", 6);
        tabela.addLista("pêra", 7);
        tabela.addLista("uva", 2);

        System.out.println(tabela.buscaLista("pêra"));
    }

}

class Tabela {
    private Double[] valorProdutos;

    private String[] indiceProdutos;

    private int indice;

    public Tabela(int tamanho) {
        valorProdutos = new Double[tamanho];
        indiceProdutos = new String[tamanho];
        indice = 0;
    }

    public int addLista(String nome, double valor) {
        if (indiceProdutos[indice] != null) {
            return -1;
        }

        indiceProdutos[indice] = nome;
        valorProdutos[indice] = valor;
        return indice++;
    }

    public Double buscaLista(String nome) {
        for (int i = 0; i < indiceProdutos.length - 1; i++) {
            if (indiceProdutos[i].equals(nome)) {
                return valorProdutos[i];
            }
        }
        return -1.0;
    }

}
