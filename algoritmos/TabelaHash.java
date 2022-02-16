package algoritmos;

import java.nio.charset.Charset;
import java.util.Arrays;

public class TabelaHash {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(5);

        tabelaHash.adicionar("laranja", 2.3);
        tabelaHash.adicionar("pêra", 5.0);
        tabelaHash.adicionar("uva", 4.0);

        System.out.printf("Tabela hash de fruta %s\n", tabelaHash);
        System.out.printf("Valor da laranja = %s\n", tabelaHash.buscar("laranja"));
        System.out.printf("Valor da pera = %s\n", tabelaHash.buscar("pêra"));
        System.out.printf("Valor da uva = %s\n", tabelaHash.buscar("uva"));
    }

    Double[] precos;

    private int tamanho;

    public TabelaHash(int tamanho) {
        this.tamanho = definindoTamanho(tamanho);
        this.precos = new Double[this.tamanho];
    }

    public void adicionar(String nome, Double preco) {
        int indice = funcaoHash(nome);
        precos[indice] = preco;
    }

    public Double buscar(String nome) {
        int indice = funcaoHash(nome);
        return precos[indice];
    }

    public int funcaoHash(String chave) {
        int resultado = 0;
        for (byte byteValor : chave.getBytes(Charset.defaultCharset())){
            resultado = (byteValor + resultado)/(definindoTamanho(chave.length()));
        }
        return resultado;
    }

    public int definindoTamanho(int tamanho) {
        return tamanho * tamanho;
    }

    @Override
    public String toString() {
        return "TabelaHash{" +
                "\nprecos=" + Arrays.toString(precos) +
                "\n}";
    }
}
