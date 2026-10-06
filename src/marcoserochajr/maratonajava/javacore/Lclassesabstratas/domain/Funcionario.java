package marcoserochajr.maratonajava.javacore.Lclassesabstratas.domain;

// Colocando o abstract nós definimos que a classe funcinário só pode ser utilizada para ser estendida por outras
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
