package explicacao.sobrecarga;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		// Usando o m�todo adicionar para somar dois n�meros inteiros
		System.out.println("Soma de 5 e 7: " + calc.adicionar(5, 7));

		// Usando o m�todo adicionar para somar tr�s n�meros inteiros
		System.out.println("Soma de 5, 7 e 10: " + calc.adicionar(5, 7, 10));

		// Usando o m�todo adicionar para somar dois n�meros decimais
		System.out.println("Soma de 3.5 e 2.5: " + calc.adicionar(3.5, 2.5));
	}
}
