package explicacao.polimorfismo;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class TestePolimorfismo {
	public static void main(String[] args) {
		Animal animal1 = new Vaca();
		Animal animal2 = new Galinha();
		Animal animal3 = new Cavalo();

		animal1.falar(); // Sa�da: Muu
		animal2.falar(); // Sa�da: Cocoric�
		animal3.falar(); // Sa�da: Hihihi
	}
}
