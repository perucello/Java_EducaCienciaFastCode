package explicacao.try_catth;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Try_catch_finally {

	public static void main(String[] args) {
		int dividendo = 10;
		int divisor = 0;

		try {
			int resultado = dividendo / divisor;
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma exceção: " + e.getMessage());
		}

	}
}
