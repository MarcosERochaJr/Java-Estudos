package marcoserochajr.maratonajava.javacore.Bintroducaometodos.teste;

import marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioExercicio01 {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();
        Funcionario mediaSalarios = new Funcionario();

        funcionario01.nome = "Marcos";
        funcionario01.idade = 25;
        funcionario01.salario = 2886;

        funcionario02.nome = "Amanda";
        funcionario02.idade = 25;
        funcionario02.salario = 5300;

        funcionario03.nome = "Julia";
        funcionario03.idade = 25;
        funcionario03.salario = 10;


        funcionario01.impressora();
        funcionario02.impressora();
        funcionario03.impressora();


        System.out.println("----------");
        mediaSalarios.mediaSalarios(funcionario01.salario, funcionario02.salario, funcionario03.salario);

    }
}
