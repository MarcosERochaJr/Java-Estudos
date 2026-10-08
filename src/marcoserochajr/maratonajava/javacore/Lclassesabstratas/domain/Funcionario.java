package marcoserochajr.maratonajava.javacore.Lclassesabstratas.domain;

// Colocando o abstract nós definimos que a classe funcinário só pode ser utilizada para ser estendida por outras
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus();

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
