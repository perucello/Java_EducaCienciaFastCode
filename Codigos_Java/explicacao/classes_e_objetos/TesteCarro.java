package explicacao.classes_e_objetos;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class TesteCarro {
	public static void main(String[] args) {
		// Criando um objeto da classe Carro
		Carro meuCarro = new Carro();

		// Atribuindo valores aos atributos
		meuCarro.marca = "Toyota";
		meuCarro.modelo = "Corolla";
		meuCarro.ano = 2022;

		// Chamando um método do objeto
		meuCarro.ligar(); // Saída: O carro está ligado!
	}
}
