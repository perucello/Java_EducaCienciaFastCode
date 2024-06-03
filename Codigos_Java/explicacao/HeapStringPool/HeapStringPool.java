package explicacao.HeapStringPool;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class HeapStringPool {
	public static void main(String[] args) {
		// Criando strings literais
		String str1 = "hello";
		String str2 = "hello";

		// Criando strings usando a palavra-chave 'new'
		String str3 = new String("hello");
		String str4 = new String("hello");

		// Verificando se as strings literais est�o no mesmo local na mem�ria (String
		// Pool)
		System.out.println("str1 e str2 referenciam o mesmo objeto? " + (str1 == str2)); // Deve imprimir true

		// Verificando se as strings criadas com 'new' est�o no mesmo local na mem�ria
		// (heap)
		System.out.println("str3 e str4 referenciam o mesmo objeto? " + (str3 == str4)); // Deve imprimir false
		
		/**
		Neste exemplo:
					str1 e str2 s�o strings literais e, portanto, s�o armazenadas no String Pool. 
					Como s�o iguais, elas referenciam o mesmo objeto no String Pool.
					
					str3 e str4 s�o criadas usando a palavra-chave new, portanto, 
					mesmo que tenham o mesmo valor "hello", elas s�o inst�ncias separadas de objetos no heap. 
					Portanto, elas n�o referenciam o mesmo objeto.
		 * */
	}

}
