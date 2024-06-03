package explicacao.sobrecarga;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class TesteCalculadora {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		// Usando o método adicionar para somar dois números inteiros
		System.out.println("Soma de 5 e 7: " + calc.adicionar(5, 7));

		// Usando o método adicionar para somar três números inteiros
		System.out.println("Soma de 5, 7 e 10: " + calc.adicionar(5, 7, 10));

		// Usando o método adicionar para somar dois números decimais
		System.out.println("Soma de 3.5 e 2.5: " + calc.adicionar(3.5, 2.5));
	}
}
