package algoritmos.hash;

import java.nio.charset.Charset;
import java.util.Hashtable;
import java.util.Map;

import static java.lang.Math.max;

public class TabelaHash {

    public static void main(String[] args) {
        //-- minha implementação de tabela hash
        TabelaHashCustom tabelaHash = new TabelaHashCustom();

        tabelaHash.adicionar("laranja", 2.3);
        tabelaHash.adicionar("pêra", 5.0);
        tabelaHash.adicionar("uva", 4.0);

        System.out.printf("Tabela hash de fruta %s\n", tabelaHash);
        System.out.printf("Valor da laranja = %s\n", tabelaHash.buscar("laranja"));
        System.out.printf("Valor da pera = %s\n", tabelaHash.buscar("pêra"));
        System.out.printf("Valor da uva = %s\n", tabelaHash.buscar("uva"));
    }

    static class TabelaHashCustom {
        Map<Integer, Double> mapPreco;

        public TabelaHashCustom() {
            mapPreco = new Hashtable<>();
        }

        public void adicionar(String nome, Double preco) {
            int indice = funcaoHash(nome);
            mapPreco.put(indice, preco);
        }

        public Double buscar(String valor) {
            int indice = funcaoHash(valor);
            return mapPreco.get(indice);
        }

        private int funcaoHash(String chave) {
            int resultado = 0;
            int tamanho = max(mapPreco.size(), 1);
            int constante = 3;
            for (byte byteValor : chave.getBytes(Charset.defaultCharset())){
                resultado += (byteValor * constante);
            }
            return resultado % tamanho;
        }

        @Override
        public String toString() {
            return "TabelaHash{" +
                    "\nprecos=" + mapPreco.values().stream().toList() +
                    "\n}";
        }
    }
}
