package exercicios.anhanguera.bora08;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Scanner;

public class CadastroProdutos {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int tamanhoArray = 5; // Definindo o tamanho do array de produtos
			Produto[] produtos = new Produto[tamanhoArray];

			System.out.println("***** Cadastro de Produtos *****");

			for (int i = 0; i < tamanhoArray; i++) {
				System.out.println();
				
				System.out.print("\nProduto #" + (i + 1));
				
				System.out.print("\nNome do produto: ");
				String nome = scanner.nextLine();
				
				System.out.print("Valor do produto: ");
				
				double valor = Double.parseDouble(scanner.nextLine());
				produtos[i] = new Produto(nome, valor);
				
				System.out.println();
			}

			System.out.println("\nProdutos cadastrados:");
			for (int i = 0; i < tamanhoArray; i++) {
				System.out.print("\nProduto #" + (i + 1) + ": " + produtos[i].getNome() + " - R$" + produtos[i].getValor());
			}
		}
	}
}


