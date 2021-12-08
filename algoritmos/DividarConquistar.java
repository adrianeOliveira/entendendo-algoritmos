package algoritmos;

public class DividarConquistar {
    public static void main(String[] args) {
        System.out.println("Soma = " + soma(new int[]{1, 2, 3}));
        System.out.println("Conta = " + conta(new int[]{1, 2, 3}, 0));
        ;
    }

    private static int conta(int[] arr, int i) {
        if (arr.length == 0) {
            return i;
        }
        return conta(pop(arr, 0), i+1);
    }

    private static int soma(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        return arr[0] + soma(pop(arr,0));
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
