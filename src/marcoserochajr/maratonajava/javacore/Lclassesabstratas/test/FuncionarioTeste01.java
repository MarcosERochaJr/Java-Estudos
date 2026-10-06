package marcoserochajr.maratonajava.javacore.Lclassesabstratas.test;

import marcoserochajr.maratonajava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import marcoserochajr.maratonajava.javacore.Lclassesabstratas.domain.Funcionario;
import marcoserochajr.maratonajava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Amanda", 20000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcos", 3000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
