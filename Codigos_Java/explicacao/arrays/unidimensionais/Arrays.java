package explicacao.arrays.unidimensionais;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Arrays {

	public static void main(String[] args) {
		// Declarando e inicializando um array unidimensional de inteiros
		int[] numeros = new int[5];

		// Preenchendo o array com alguns valores
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * 2; // Preenchendo com o dobro do índice
		}

		// Exibindo os valores do array
		System.out.println("Array:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

	/**
	 * 
	 * Inicializa um array de inteiros com tamanho 5 int[] numero = new int[5];
	 * System.out.println(numero);
	 * -------------------------------------------------------------------------------------------------------
	 * inicializando Array int[] numeros = new int[5]; // Inicializa um array de
	 * inteiros com tamanho 5
	 * -------------------------------------------------------------------------------------------------------
	 * Atribuindo valores Array numeros[0] = 10; numeros[1] = 20; numeros[2] = 30;
	 * numeros[3] = 40; numeros[4] = 50;
	 * -------------------------------------------------------------------------------------------------------
	 * Iterando sobre um Array for (int i = 0; i < numeros.length; i++) {
	 * System.out.println(numeros[i]); }
	 * -------------------------------------------------------------------------------------------------------
	 * inicialização de Array com Valores iniciais int[] primos = { 2, 3, 5, 7, 11
	 * }; // Inicializa um array com valores iniciais
	 * -------------------------------------------------------------------------------------------------------
	 * Copiando Arrays int[] copia = Arrays.copyOf(numeros, numeros.length); //
	 * Copia o array "numeros" para "copia"
	 * -------------------------------------------------------------------------------------------------------
	 * ordenando um Array Arrays.sort(numeros); // Ordena o array "numeros"
	 * -------------------------------------------------------------------------------------------------------
	 * Pesquisando e ordenando um Array int indice = Arrays.binarySearch(numeros,
	 * 30); // Procura o valor 30 no array ordenado "numeros"
	 * -------------------------------------------------------------------------------------------------------
	 * Verificando se um Valor Existe em um Array Não Ordenado boolean existe =
	 * Arrays.asList(numeros).contains(30); // Verifica se o valor 30 existe no
	 * array "numeros"
	 * -------------------------------------------------------------------------------------------------------
	 * 
	 */

}
