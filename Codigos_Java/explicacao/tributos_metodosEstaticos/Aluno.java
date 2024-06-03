package explicacao.tributos_metodosEstaticos;

/*
 * Fábio Perucello -  EducaCiência FastCode
 */
public class Aluno {
    private int idade;

	static int calcularMediaIdades(Aluno[] alunos) {
        int soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.idade;
        }
        return soma / alunos.length;
    }
}
