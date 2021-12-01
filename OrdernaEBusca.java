public class OrdernaEBusca {
    public static void main(String[] args) {
        int[] ordernarPorSelecao = ordernarPorSelecao(new int[]{4, 5, 2, 6, 7, 9});
        printArr(ordernarPorSelecao);
    }

    private static int buscaIndiceDoMenor(int[] arr) {
        int menor = arr[0];
        int indice_do_menor = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= menor) {
                menor = arr[i];
                indice_do_menor = i;
            }
        }
        return indice_do_menor;
    }

    private static int[] ordernarPorSelecao(int[] arr) {
        int[] novoArr = new int[arr.length];

        for (int i = 0; i < novoArr.length; i++) {
            int indiceDoMenor  = buscaIndiceDoMenor(arr);
            novoArr[i] = arr[indiceDoMenor];
            arr = pop(arr, indiceDoMenor);
        }
        return novoArr;
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d = %d\n", i, arr[i]);
        }
    }

    private static int[] pop(int[] arr, int index) {
        int[] copy = new int[arr.length-1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                copy[j++] = arr[i];
            }
        }
        return copy;
    }
}
