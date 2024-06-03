package explicacao.for_each;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.ArrayList;
import java.util.List;

public class For_each_Strings {

	public static void main(String[] args) {
		
		List<String> nomes1 = new ArrayList<>();
		nomes1.add("Alice");
		nomes1.add("Bob");
		nomes1.add("Carol");

		for (String nome : nomes1) {
		    System.out.println(nome);
		}


	}

}
