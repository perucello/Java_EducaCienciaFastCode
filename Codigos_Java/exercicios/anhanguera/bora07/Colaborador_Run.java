package exercicios.anhanguera.bora07;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.Scanner;

public class Colaborador_Run {
	public static void main(String[] args) {
try (// TODO code application logic here
		Scanner ler = new Scanner(System.in)) {
	
			Gerente gerente = new Gerente();
			Administrativo adm = new Administrativo();
			
			System.out.print("Informe o seu nome: ");
			gerente.nome = ler.next();
			
			System.out.print("\n################################################\n");
			
			System.out.print("O nome do gerente informado é: " + gerente.nome + "\n");
			gerente.trabalhar();
			
			System.out.print("\n################################################\n");
			
			System.out.print("Informe o nome do colaborador administrativo: ");
			adm.nome = ler.next();
			
			System.out.print("Informe o CPF do colaborador administrativo: ");
			adm.CPF = ler.nextLong();
			
			System.out.print("Informe a função: ");
			adm.funcao = ler.next();
			
			System.out.println("Dados para confirmação: ");
			System.out.println("Nome: " + adm.nome);
			System.out.println("CPF: " + adm.CPF);
			System.out.println("Nome: " + adm.funcao);
			
			adm.comer();
		}
	}
}