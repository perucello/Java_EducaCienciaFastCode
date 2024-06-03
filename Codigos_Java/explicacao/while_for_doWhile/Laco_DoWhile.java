package explicacao.while_for_doWhile;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Scanner;

public class Laco_DoWhile {

	private static Scanner ler;

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Digite um número positivo: ");
			ler = new Scanner(System.in);
			numero = ler.nextInt();
		} while (numero <= 0);
		System.out.println("Número positivo fornecido: " + numero);
	}

}
