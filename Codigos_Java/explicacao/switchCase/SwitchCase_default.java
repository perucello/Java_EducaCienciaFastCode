package explicacao.switchCase;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class SwitchCase_default {

	public static void main(String[] args) {
		String sabor = "baunilha";

		switch (sabor) {
		case "baunilha":
			System.out.println("Sabor escolhido: Baunilha");
			break;
		case "morango":
			System.out.println("Sabor escolhido: Morango");
			break;
		case "chocolate":
			System.out.println("Sabor escolhido: Chocolate");
			break;
		default:
			System.out.println("Sabor n�o reconhecido");
		}

	}
}
