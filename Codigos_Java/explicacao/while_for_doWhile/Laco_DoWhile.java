package explicacao.while_for_doWhile;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
import java.util.Scanner;

public class Laco_DoWhile {

	private static Scanner ler;

	public static void main(String[] args) {

		int numero;

		do {
			System.out.println("Digite um n�mero positivo: ");
			ler = new Scanner(System.in);
			numero = ler.nextInt();
		} while (numero <= 0);
		System.out.println("N�mero positivo fornecido: " + numero);
	}

}
