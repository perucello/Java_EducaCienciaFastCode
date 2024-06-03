package explicacao.encapsulamento;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class Pessoa {
	private String nome;
	private int idade;

	// M�todo getter para o atributo 'nome'
	public String getNome() {
		return nome;
	}

	// M�todo setter para o atributo 'nome'
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}

	// M�todo getter para o atributo 'idade'
	public int getIdade() {
		return idade;
	}

	// M�todo setter para o atributo 'idade'
	public void setIdade(int novaIdade) {
		if (novaIdade >= 0) { // Verifica se a idade � positiva
			this.idade = novaIdade;
		} else {
			System.out.println("Idade inv�lida");
		}
	}
}
