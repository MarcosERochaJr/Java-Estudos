package marcoserochajr.maratonajava.javacore.Gassociacao.test;

import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Escola;
import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Willian Suane");
        Professor professor2 = new Professor("Marcos");
        Professor[] professores = new Professor[]{professor1, professor2};
        Escola escola = new Escola("DevDojo", professores);

        escola.imprime();
    }
}
