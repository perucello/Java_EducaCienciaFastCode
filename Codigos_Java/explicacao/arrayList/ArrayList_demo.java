package explicacao.arrayList;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_demo {

	public static void main(String[] args) {

		ArrayList<String> banda_musica = new ArrayList<>();

		// Adicionando a primeira Banda de Musica na nossa Lista.
		banda_musica.add("Guns'n Roses");
		System.out.println("Adicionando primeira banda de musica!");
		System.out.println(Arrays.toString(banda_musica.toArray()));
		System.out.println("--------------------------------------");

		// Adicionando nossa segunda banda de Musica
		banda_musica.add("Fratuck Rock");
		System.out.println("Adicionando nossa segunda banda de Rock...");
		System.out.println(Arrays.toString(banda_musica.toArray()));
		System.out.println("--------------------------------------");

		// pegando a segunda banda
		System.out.println("Banda 2 -: " + banda_musica.get(1));
		System.out.println("--------------------------------------");

		// removendo banda

		// 00
		banda_musica.remove("Fratuck Rock");
		System.out.println("Removendo Fratuck Rock: " + Arrays.toString(banda_musica.toArray()));

		// 01
		banda_musica.removeAll(banda_musica);
		System.out.println("Removendo listas: " + Arrays.toString(banda_musica.toArray()));
		System.out.println("--------------------------------------");

		// 02
		banda_musica.clear();
		System.out.println("Removendo listas: " + Arrays.toString(banda_musica.toArray()));
		System.out.println("--------------------------------------");

	}

}
