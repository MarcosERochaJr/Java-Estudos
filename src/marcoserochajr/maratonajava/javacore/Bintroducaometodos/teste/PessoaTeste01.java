package marcoserochajr.maratonajava.javacore.Bintroducaometodos.teste;

import marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcos");
        pessoa.setIdade(25);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
