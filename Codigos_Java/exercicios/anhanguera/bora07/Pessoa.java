package exercicios.anhanguera.bora07;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Pessoa {
	public String nome;
	public String sexo;
	public Long CPF;

//Método 1
	public void comer() {
		System.out.println("Estou com fome!");
		System.out.print("\n################################################\n");
	}

//Método 2
	public void trabalhar() {
		System.out.println("O/a colaborador(a) " + nome + " vai trabalhar" );
		System.out.print("\n################################################\n");
	}
}