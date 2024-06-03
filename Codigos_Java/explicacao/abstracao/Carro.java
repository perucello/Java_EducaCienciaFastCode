package explicacao.abstracao;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Carro {
	String marca;
	String modelo;
	int ano;

	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public void ligar() {
		System.out.println("O carro está ligado!");
	}

	public void acelerar() {
		System.out.println("O carro está acelerando!");
	}

}
