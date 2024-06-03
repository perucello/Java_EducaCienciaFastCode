package explicacao.construtores;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class TesteCasa {
	public static void main(String[] args) {
		// Criando um objeto Casa usando o método construtor
		Casa minhaCasa = new Casa("Azul", 3);

		// Acessando os atributos da Casa
		System.out.println("Cor da casa: " + minhaCasa.cor);
		System.out.println("Número de cômodos da casa: " + minhaCasa.numeroComodos);
	}
}
