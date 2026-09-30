package marcoserochajr.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;


    public void imprimir(){
        super.imprimir();
        System.out.println("Salário: R$ " + this.salario);
    }

    public Funcionario(String nome) {
        super(nome);
    }

    // Agora conseguimos colocar o this.nome aqui mesmo sendo da classe Pessoa
    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
