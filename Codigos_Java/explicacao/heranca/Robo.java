package explicacao.heranca;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
//Classe base
class Robo {
	void mover() {
		System.out.println("O rob� est� se movendo.");
	}
	
	
	// main apenas para executar
	public static void main(String[] args) {
		
		RoboVoador robozinho = new RoboVoador();
		robozinho.mover();
		robozinho.voar();
		
	}
}
