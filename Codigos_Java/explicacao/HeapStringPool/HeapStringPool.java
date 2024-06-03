package explicacao.HeapStringPool;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class HeapStringPool {
	public static void main(String[] args) {
		// Criando strings literais
		String str1 = "hello";
		String str2 = "hello";

		// Criando strings usando a palavra-chave 'new'
		String str3 = new String("hello");
		String str4 = new String("hello");

		// Verificando se as strings literais estão no mesmo local na memória (String
		// Pool)
		System.out.println("str1 e str2 referenciam o mesmo objeto? " + (str1 == str2)); // Deve imprimir true

		// Verificando se as strings criadas com 'new' estão no mesmo local na memória
		// (heap)
		System.out.println("str3 e str4 referenciam o mesmo objeto? " + (str3 == str4)); // Deve imprimir false
		
		/**
		Neste exemplo:
					str1 e str2 são strings literais e, portanto, são armazenadas no String Pool. 
					Como são iguais, elas referenciam o mesmo objeto no String Pool.
					
					str3 e str4 são criadas usando a palavra-chave new, portanto, 
					mesmo que tenham o mesmo valor "hello", elas são instâncias separadas de objetos no heap. 
					Portanto, elas não referenciam o mesmo objeto.
		 * */
	}

}
