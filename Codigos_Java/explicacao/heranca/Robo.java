package explicacao.heranca;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
//Classe base
class Robo {
	void mover() {
		System.out.println("O robô está se movendo.");
	}
	
	
	// main apenas para executar
	public static void main(String[] args) {
		
		RoboVoador robozinho = new RoboVoador();
		robozinho.mover();
		robozinho.voar();
		
	}
}
