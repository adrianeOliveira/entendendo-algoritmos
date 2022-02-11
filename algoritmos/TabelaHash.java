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

    String[] nomes;

    Double[] precos;

    public TabelaHash(int tamanho) {
        int tamanhoFinal = definindoTamanho(tamanho);
        this.nomes = new String[tamanhoFinal];
        this.precos = new Double[tamanhoFinal];
    }

    public void adicionar(String nome, Double preco) {
        int indice = funcaoHash(nome);
        nomes[indice] = nome;
        precos[indice] = preco;
    }

    public Double buscar(String nome) {
        int indice = funcaoHash(nome);
        return precos[indice];
    }

    public int funcaoHash(String valor) {
        int resultado = 0;
        int tamanho = valor.length();
        for (byte byteValor : valor.getBytes(Charset.defaultCharset())){
            resultado = (byteValor + resultado)/(definindoTamanho(tamanho));
        }
        return resultado;
    }

    public int definindoTamanho(int tamanho) {
        return tamanho * tamanho;
    }

    @Override
    public String toString() {
        return "TabelaHash{" +
                "\nnomes=" + Arrays.toString(nomes) +
                "\nprecos=" + Arrays.toString(precos) +
                "\n}";
    }
}
