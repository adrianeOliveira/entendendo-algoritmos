public class BuscaBinaria {
	public static void main(String[] args) {
		int lista[] = {1, 2, 3, 4, 5, 6 ,7 , 8, 9, 10};
		int item = 3;
		pesquisa_binaria(lista, item);
	}

	private static int pesquisa_binaria(int[] lista, int item) {
		int baixo = 0;
		int alto = lista.length - 1;
		int chute = 0;
		int meio = 0;

		while (baixo <= alto) {
			meio = (baixo + alto) / 2;
			chute = lista[meio];
			if (chute == item) {
				System.out.println(String.format("Chute = item: %d", chute));
				return meio;
			} else if (chute > item) {
				System.out.println(String.format("Chute muito alto: %d", chute));
				alto = meio - 1;
			} else {
				System.out.println(String.format("Chute muito baixo: %d", chute));
				baixo = meio + 1;
			}
		}
		System.out.println(String.format("Chute não esta dentro do array: %d", chute));
		return baixo;
	}

}