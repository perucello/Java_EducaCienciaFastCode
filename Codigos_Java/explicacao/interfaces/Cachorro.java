package explicacao.interfaces;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Cachorro implements Animal {
	
	@Override
	public void fazerSom() {
		System.out.println("Au au!");
	}

	@Override
	public void mover() {
		System.out.println("Correndo...");
	}
}
