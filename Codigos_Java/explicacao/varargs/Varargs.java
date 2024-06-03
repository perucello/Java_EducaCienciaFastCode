package explicacao.varargs;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Varargs {

	private static int resultado1;
	private static int resultado2;
	private static int resultado3;

	public static void main(String[] args) {

		setResultado1(somar(1, 2));
		setResultado2(somar(1, 2, 3));
		setResultado3(somar(1, 2, 3, 4, 5));

	}

	public static int somar(int... numeros) {
		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		System.out.println(soma);
		return soma;
	}

	public static int getResultado1() {
		return resultado1;
	}

	public static void setResultado1(int resultado1) {
		Varargs.resultado1 = resultado1;
	}

	public static int getResultado2() {
		return resultado2;
	}

	public static void setResultado2(int resultado2) {
		Varargs.resultado2 = resultado2;
	}

	public static int getResultado3() {
		return resultado3;
	}

	public static void setResultado3(int resultado3) {
		Varargs.resultado3 = resultado3;
	}

}
