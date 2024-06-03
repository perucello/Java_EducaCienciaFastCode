package explicacao.sobreposicao;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class TesteAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        cachorro.fazerSom(); // Saída: Au Au
        gato.fazerSom();     // Saída: Miau
        vaca.fazerSom();     // Saída: Muu
    }
}
