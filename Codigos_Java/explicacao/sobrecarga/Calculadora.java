package explicacao.sobrecarga;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Calculadora {
	// Método para adicionar dois números inteiros
	public int adicionar(int a, int b) {
		return a + b;
	}

	// Método para adicionar três números inteiros
	public int adicionar(int a, int b, int c) {
		return a + b + c;
	}

	// Método para adicionar dois números decimais
	public double adicionar(double a, double b) {
		return a + b;
	}
}
