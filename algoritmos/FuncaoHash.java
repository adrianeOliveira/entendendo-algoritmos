package algoritmos;

public class FuncaoHash {

    public static void main(String[] args) {
       String nome = args[0];
        System.out.printf("Hash do nome %s = %d\n", nome, funcaoHash(nome));
    }

    static public int funcaoHash(String nome) {
        return nome.hashCode() / 100000000;
    }

}
