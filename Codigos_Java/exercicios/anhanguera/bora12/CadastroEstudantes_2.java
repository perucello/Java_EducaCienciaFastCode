package exercicios.anhanguera.bora12;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Scanner;

public class CadastroEstudantes_2 {
	private static final int TAMANHO_VETOR = 100;
	private static final int NUMERO_DADOS = 5; // Nome, Sobrenome, Idade, Nome da mãe, Data de nascimento
	private static final String[][] estudantes = new String[TAMANHO_VETOR][NUMERO_DADOS];
	private static int quantidadeEstudantes = 0;
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo ao cadastro de estudantes!");

		boolean continuar = true;
		
		while (continuar) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar novo estudante");
			System.out.println("2 - Exibir estudantes cadastrados");
			System.out.println("3 - Sair");
			System.out.print("Opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer de entrada

			switch (opcao) {
			case 1:
				cadastrarEstudante();
				break;
			case 2:
				exibirEstudantes();
				break;
			case 3:
				continuar = false;
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
			}
		}
	}

	private static void cadastrarEstudante() {
		if (quantidadeEstudantes < TAMANHO_VETOR) {
			System.out.println("\nCadastro de novo estudante:");
			
			System.out.print("Nome: ");
			String nome = scanner.nextLine();
			
			System.out.print("Sobrenome: ");
			String sobrenome = scanner.nextLine();
			
			System.out.print("Idade: ");
			String idade = scanner.nextLine();
			
			System.out.print("Nome da mãe: ");
			String nomeMae = scanner.nextLine();
			
			System.out.print("Data de nascimento: ");
			String dataNascimento = scanner.nextLine();

			estudantes[quantidadeEstudantes][0] = nome;
			estudantes[quantidadeEstudantes][1] = sobrenome;
			estudantes[quantidadeEstudantes][2] = idade;
			estudantes[quantidadeEstudantes][3] = nomeMae;
			estudantes[quantidadeEstudantes][4] = dataNascimento;

			quantidadeEstudantes++;
			System.out.println("Estudante cadastrado com sucesso!");
			
		} else {
			
			System.out.println("Limite de estudantes atingido. Não é possível cadastrar mais estudantes.");
			
		}
	}

	private static void exibirEstudantes() {
		System.out.println("\nEstudantes cadastrados:");
		
		for (int i = 0; i < quantidadeEstudantes; i++) {
			
			System.out.println("Estudante #" + (i + 1) + ":");
			
			System.out.println("Nome: " + estudantes[i][0]);
			System.out.println("Sobrenome: " + estudantes[i][1]);
			System.out.println("Idade: " + estudantes[i][2]);
			System.out.println("Nome da mãe: " + estudantes[i][3]);
			System.out.println("Data de nascimento: " + estudantes[i][4]);
			
			System.out.println("-------------------------");
			
		}
	}
}
