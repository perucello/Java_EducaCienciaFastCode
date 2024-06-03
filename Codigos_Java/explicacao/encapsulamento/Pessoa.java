package explicacao.encapsulamento;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Pessoa {
	private String nome;
	private int idade;

	// Método getter para o atributo 'nome'
	public String getNome() {
		return nome;
	}

	// Método setter para o atributo 'nome'
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	// Método getter para o atributo 'idade'
	public int getIdade() {
		return idade;
	}

	// Método setter para o atributo 'idade'
	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) { // Verifica se a idade é positiva
			this.idade = novaIdade;
		} else {
			System.out.println("Idade inválida");
		}
	}
}
