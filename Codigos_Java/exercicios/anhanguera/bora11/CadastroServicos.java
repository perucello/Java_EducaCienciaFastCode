package exercicios.anhanguera.bora11;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Scanner;

public class CadastroServicos {

	private static final int TAMANHO_ARRAY = 5;
	private static final Scanner scanner = new Scanner(System.in);
	private static final Servico[] servicos = new Servico[TAMANHO_ARRAY];

	public static void main(String[] args) {
		System.out.println("Cadastro de Serviços");

		for (int i = 0; i < TAMANHO_ARRAY; i++) {
			System.out.println("\nServiço #" + (i + 1));
			System.out.print("Nome do serviço: ");
			String nome = scanner.nextLine();
			System.out.print("Preço do serviço: ");
			double preco = Double.parseDouble(scanner.nextLine());

			servicos[i] = new Servico(nome, preco);
		}
		exibirServicosCadastrados();
		exibirServicoMaiorPreco();
	}

	private static void exibirServicosCadastrados() {
		System.out.println("\nServiços cadastrados:");
		for (Servico servico : servicos) {
			System.out.println("Nome: " + servico.getNome() + " - Preço: R$" + servico.getPreco());
		}
	}

	private static void exibirServicoMaiorPreco() {
		double maiorPreco = servicos[0].getPreco();
		Servico servicoMaiorPreco = servicos[0];

		for (Servico servico : servicos) {
			if (servico.getPreco() > maiorPreco) {
				maiorPreco = servico.getPreco();
				servicoMaiorPreco = servico;
			}
		}
		System.out.println("\nServiço com maior preço:");
		System.out.println("Nome: " + servicoMaiorPreco.getNome() + " - Preço: R$" + servicoMaiorPreco.getPreco());
	}
}
