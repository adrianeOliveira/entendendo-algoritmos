package algoritmos;

import java.util.Arrays;

public class TabelaHash {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash(5);

        tabelaHash.adicionar("laranja", 2.3);
        tabelaHash.adicionar("pêra", 5.0);
        tabelaHash.adicionar("uva", 4.0);

        System.out.printf("Tabela hash de fruta %s\n", tabelaHash);
        System.out.printf("Valor da laranja = %s\n", tabelaHash.buscar("laranja"));
    }

    String[] nomes;

    Double[] precos;

    public TabelaHash(int tamanho) {
        this.nomes = new String[tamanho];
        this.precos = new Double[tamanho];
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

    public int funcaoHash(String nome) {
        int hashCodeAbsoluto = Math.abs(nome.hashCode());

        int indice = hashCodeAbsoluto / contarCasasDecimais(hashCodeAbsoluto);

        if (indice > precos.length) {
            throw new RuntimeException("Nome inválido para calculo do indice da tabela!");
        }

        return indice;
    }

    public int contarCasasDecimais(int valor) {
        int valorASerComparado = Math.abs(valor);

        if (valorASerComparado <  10) {
            return 1;
        }

        if (valorASerComparado >=  10 && valorASerComparado < Math.pow(10, 2)) {
            return 10;
        }

        if (valorASerComparado >= Math.pow(10, 2) && valorASerComparado < Math.pow(10, 3)) {
            return (int) Math.pow(10, 2);
        }

        if (valorASerComparado >= Math.pow(10, 3) && valorASerComparado < Math.pow(10, 4)) {
            return (int) Math.pow(10, 3);
        }

        if (valorASerComparado >= Math.pow(10, 4) && valorASerComparado < Math.pow(10, 5)) {
            return (int) Math.pow(10, 4);
        }

        if (valorASerComparado >= Math.pow(10, 5) && valorASerComparado < Math.pow(10, 6)) {
            return (int) Math.pow(10, 5);
        }

        if (valorASerComparado >= Math.pow(10, 6) && valorASerComparado < Math.pow(10, 7)) {
            return (int) Math.pow(10, 6);
        }

        if (valorASerComparado >= Math.pow(10, 7) && valorASerComparado < Math.pow(10, 8)) {
            return (int) Math.pow(10, 7);
        }

        if (valorASerComparado >= Math.pow(10, 8) && valorASerComparado < Math.pow(10, 9)) {
            return (int) Math.pow(10, 8);
        }

        return (int) Math.pow(10, 9);
    }

    @Override
    public String toString() {
        return "TabelaHash{" +
                "\nnomes=" + Arrays.toString(nomes) +
                "\nprecos=" + Arrays.toString(precos) +
                '}';
    }
}
