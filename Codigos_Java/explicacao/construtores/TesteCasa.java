package explicacao.construtores;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class TesteCasa {
	public static void main(String[] args) {
		// Criando um objeto Casa usando o m�todo construtor
		Casa minhaCasa = new Casa("Azul", 3);

		// Acessando os atributos da Casa
		System.out.println("Cor da casa: " + minhaCasa.cor);
		System.out.println("N�mero de c�modos da casa: " + minhaCasa.numeroComodos);
	}
}
