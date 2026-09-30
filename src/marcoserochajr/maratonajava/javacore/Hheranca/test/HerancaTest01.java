package marcoserochajr.maratonajava.javacore.Hheranca.test;

import marcoserochajr.maratonajava.javacore.Hheranca.domain.Endereco;
import marcoserochajr.maratonajava.javacore.Hheranca.domain.Funcionario;
import marcoserochajr.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Endereco endereco02 = new Endereco();
        endereco.setRua("Avenida Santa Cruz");
        endereco.setNumero(3255);
        endereco.setCep("14403-500");
        endereco02.setRua("Avenida Ismael Alonso y Alonso");
        endereco02.setNumero(3606);
        endereco02.setCep("14403-500");
        Pessoa pessoa = new Pessoa("Marcos Elias");
        pessoa.setIdade(25);
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Amanda Helen");
        funcionario.setIdade(24);
        funcionario.setEndereco(endereco02);
        funcionario.setSalario(1234);
        pessoa.imprimir();
        System.out.println("-------------");
        funcionario.imprimir();
    }
}
