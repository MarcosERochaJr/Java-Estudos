package marcoserochajr.maratonajava.javacore.Aintroducaoclasses.teste;

import marcoserochajr.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "William";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + ", idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}
