package explicacao.classes_e_objetos;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class TesteCarro {
	public static void main(String[] args) {
		// Criando um objeto da classe Carro
		Carro meuCarro = new Carro();

		// Atribuindo valores aos atributos
		meuCarro.marca = "Toyota";
		meuCarro.modelo = "Corolla";
		meuCarro.ano = 2022;

		// Chamando um m�todo do objeto
		meuCarro.ligar(); // Sa�da: O carro est� ligado!
	}
}
