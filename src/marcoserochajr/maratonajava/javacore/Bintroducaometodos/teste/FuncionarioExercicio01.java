package marcoserochajr.maratonajava.javacore.Bintroducaometodos.teste;

import marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio01 {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Marcos";
        funcionario01.idade = 25;
        funcionario01.salarios = new double[]{2000, 2500, 204};

        funcionario01.imprimir();
    }
}
