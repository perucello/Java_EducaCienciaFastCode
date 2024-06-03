package explicacao.arrays.multidomensionais;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class Arrays {

	/** EXEMPLO DE ARRAY MULTIDOMENSIONAL */
	 public static void main(String[] args) {
	        // Declarando e inicializando uma matriz bidimensional de inteiros
	        int[][] matriz = new int[3][3];

	        // Preenchendo a matriz com alguns valores
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                matriz[i][j] = i + j; // Preenchendo com a soma dos �ndices da linha e da coluna
	            }
	        }

	        // Exibindo os valores da matriz
	        System.out.println("Matriz:");
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println(); // Adicionando uma quebra de linha ap�s cada linha da matriz
	        }
	    }
	}