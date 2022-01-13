package algoritmos;

import java.util.HashMap;

public class TabelaHash {

    public static void main(String[] args) {
        Tabela tabela = new Tabela(10);
        tabela.add("maçã", 6);
        tabela.add("pêra", 7);
        tabela.add("uva", 2);

        System.out.println(tabela.busca("pêra"));

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("sabão", 3.0);
        produtos.put("detergente", 4.0);
        produtos.put("desinfetante", 5.0);

        System.out.println(produtos.get("desinfetante"));
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

    public int add(String nome, double valor) {
        if (indiceProdutos[indice] != null) {
            return -1;
        }

        indiceProdutos[indice] = nome;
        valorProdutos[indice] = valor;
        return indice++;
    }

    public Double busca(String nome) {
        for (int i = 0; i < indiceProdutos.length - 1; i++) {
            if (indiceProdutos[i].equals(nome)) {
                return valorProdutos[i];
            }
        }
        return -1.0;
    }

}
