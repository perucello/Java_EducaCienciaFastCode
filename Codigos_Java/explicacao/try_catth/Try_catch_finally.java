package explicacao.try_catth;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class Try_catch_finally {

	public static void main(String[] args) {
		int dividendo = 10;
		int divisor = 0;

		try {
			int resultado = dividendo / divisor;
			System.out.println(resultado);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma exce��o: " + e.getMessage());
		}

	}
}
