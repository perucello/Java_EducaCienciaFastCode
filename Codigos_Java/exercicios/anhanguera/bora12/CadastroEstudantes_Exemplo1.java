package exercicios.anhanguera.bora12;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Arrays;
import java.util.Scanner;

public class CadastroEstudantes_Exemplo1 {

	public static void main(String[] args) {
		String[][] estudantes = new String[2][5];
		String[] dadosPessoais = new String[7];
		int opcao = 0;
		int verificar = 0;
		int guardaEscolha = 0;
		int tamanho = 2;
		try (Scanner sc = new Scanner(System.in)) {
			dadosPessoais[1] = "Nome";
			dadosPessoais[2] = "Sobrenome";
			dadosPessoais[3] = "Idade";
			dadosPessoais[4] = "Mãe";
			dadosPessoais[5] = "data de nascimento";
			do {
				System.out.println("\n\n#### Cadastro de Estudante ###");
				System.out.println("##################################");
				System.out.println("# ==> 1 - Cadastrar estudante #");
				System.out.println("# ==> 2 - Mostrar estudante #");
				System.out.println("# ==> 0 - Fechar #");
				System.out.println("##################################");
				System.out.println("Escolha uma opcao: ");
				opcao = sc.nextInt();
				System.out.print("\n");
				switch (opcao) {
				case 1:
					System.out.println("Cadastro de estudante: ");
					// Adciona itens
					for (int i = 0; i < 2; i++) {
						System.out.println("Adcionar estudante? ");
						System.out.println("1 para sim \n2 para nao: ");
						guardaEscolha = sc.nextInt();
						if (guardaEscolha == 1) {
							System.out.printf("%d. ordem \n", (i + 1));
							verificar = verificar + 1;
							for (int j = 0; j < 5; j++) {
								System.out.printf("%s ", dadosPessoais[j + 1]);
								System.out.printf("= ", i, (j + 1));
								estudantes[i][j] = sc.next();
							}
							System.out.printf("\n");
						} else {
							break;
						}
					}
					break;
				case 2:
					// Mostra alunos
					if (verificar > 0) {
						for (int i = 0; i < 2; i++) {
							if (verificar == 2) {
								System.out.printf("%d. ordem \n", (i + 1));
								System.out.printf("ID do estudante = 00%d \n", (i + 1));
								for (int j = 0; j < 5; j++) {
									System.out.printf("%s ", dadosPessoais[j + 1]);
									System.out.printf("= %s \n", estudantes[i][j]);
								}
								System.out.printf("\n");
							} else {
								estudantes = Arrays.copyOf(estudantes, tamanho - 1);

								verificar = 0;
								System.out.printf("%d. ordem \n", (i + 1));
								System.out.printf("ID do estudante= 00%d \n", (i + 1));
								for (int j = 0; j < 5; j++) {
									System.out.printf("%s ", dadosPessoais[j + 1]);
									System.out.printf("= %s \n", estudantes[i][j]);
								}
								System.out.printf("\n");
								break;
							}
						}
					} else {
						System.out.println("Nenhum estudante cadastrado!");
					}
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}
			} while (opcao != 0);
		}
	}
}