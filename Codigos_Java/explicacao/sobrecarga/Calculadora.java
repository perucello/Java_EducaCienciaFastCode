package explicacao.sobrecarga;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class Calculadora {
	// M�todo para adicionar dois n�meros inteiros
	public int adicionar(int a, int b) {
		return a + b;
	}

	// M�todo para adicionar tr�s n�meros inteiros
	public int adicionar(int a, int b, int c) {
		return a + b + c;
	}

	// M�todo para adicionar dois n�meros decimais
	public double adicionar(double a, double b) {
		return a + b;
	}
}
