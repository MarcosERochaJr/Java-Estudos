package marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.test;

import marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.domain.Aluno;
import marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.domain.Professor;
import marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.domain.Local;
import marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.domain.Seminario;

public class AssociacoesEx01 {
    static void main(String[] args) {
        Aluno aluno01 = new Aluno("Marcos", 25);
        Aluno aluno02 = new Aluno("Amanda", 24);
        Aluno aluno03 = new Aluno("Luis", 28);
        Aluno aluno04 = new Aluno("Rafael", 26);
        Aluno aluno05 = new Aluno("Vinicius", 14);
        Aluno aluno06 = new Aluno("Julia", 13);

        Aluno[] alunosSeminario01 = {aluno01, aluno02, aluno03};
        Aluno[] alunosSeminario02 = {aluno04, aluno05,  aluno06};

        Professor professor01 = new Professor("Rafael", "IA");
        Professor professor02 = new Professor("Eduardo", "Industria 4.0");
        Professor[] professoresSeminario01 = {professor02};
        Professor[] professoresSeminario02 = {professor01, professor02};

        Local local = new Local("Avenida Santa Cruz, 3255");

        Seminario seminario01 = new Seminario("Tecnologia na indústria", alunosSeminario01, professoresSeminario01, local);
        Seminario seminario02 = new Seminario("Inteligência Artificial no dia-a-dia", alunosSeminario02, professoresSeminario02, local);

        seminario01.imprimirSeminario();

        seminario02.imprimirSeminario();
    }
}
