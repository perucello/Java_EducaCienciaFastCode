package explicacao.polimorfismo;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */

//Classe base
class Animal {
	public void falar() {
		System.out.println("Este animal emite algum som.");
	}
}

//Subclasse Vaca
class Vaca extends Animal {
	@Override
	public void falar() {
		System.out.println("Muu");
	}
}

//Subclasse Galinha
class Galinha extends Animal {
	@Override
	public void falar() {
		System.out.println("Cocoricó");
	}
}

//Subclasse Cavalo
class Cavalo extends Animal {
	@Override
	public void falar() {
		System.out.println("Hihihi");
	}
}
