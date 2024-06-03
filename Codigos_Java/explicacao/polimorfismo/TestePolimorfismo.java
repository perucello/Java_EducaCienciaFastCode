package explicacao.polimorfismo;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class TestePolimorfismo {
	public static void main(String[] args) {
		Animal animal1 = new Vaca();
		Animal animal2 = new Galinha();
		Animal animal3 = new Cavalo();

		animal1.falar(); // Saída: Muu
		animal2.falar(); // Saída: Cocoricó
		animal3.falar(); // Saída: Hihihi
	}
}
