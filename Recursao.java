public class Recursao {
    public static void main(String[] args) {
        contagemRegressiva(10);
    }

    private static void contagemRegressiva(int numero) {
        System.out.println(numero);
        if (numero >= 1) {
            contagemRegressiva(numero - 1);
        }
    }
}
