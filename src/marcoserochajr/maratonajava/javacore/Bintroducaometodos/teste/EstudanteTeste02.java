package marcoserochajr.maratonajava.javacore.Bintroducaometodos.teste;

import marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marcos";
        estudante01.sexo = 'M';
        estudante01.idade = 25;

        estudante02.nome = "Amanda";
        estudante02.sexo = 'F';
        estudante02.idade = 24;

        estudante01.imprime();
        estudante02.imprime();
    }
}
