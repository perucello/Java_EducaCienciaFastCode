package explicacao.sobreposicao;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */

//Classe base
class Animal {
	void fazerSom() {
		System.out.println("Este animal emite algum som.");
	}
}

//Subclasse Cachorro
class Cachorro extends Animal {
	@Override
	void fazerSom() {
		System.out.println("Au Au");
	}
}

//Subclasse Gato
class Gato extends Animal {
	@Override
	void fazerSom() {
		System.out.println("Miau");
	}
}

//Subclasse Vaca
class Vaca extends Animal {
	@Override
	void fazerSom() {
		System.out.println("Muu");
	}
}
