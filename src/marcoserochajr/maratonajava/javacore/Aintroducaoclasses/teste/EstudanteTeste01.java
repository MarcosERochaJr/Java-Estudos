package marcoserochajr.maratonajava.javacore.Aintroducaoclasses.teste;

import marcoserochajr.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Marcos";
        estudante.idade = 25;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
