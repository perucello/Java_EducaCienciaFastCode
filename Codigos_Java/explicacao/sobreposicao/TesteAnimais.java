package explicacao.sobreposicao;

/*
 * F�bio Perucello -  EducaCi�ncia FastCode
 */
public class TesteAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();

        cachorro.fazerSom(); // Sa�da: Au Au
        gato.fazerSom();     // Sa�da: Miau
        vaca.fazerSom();     // Sa�da: Muu
    }
}
