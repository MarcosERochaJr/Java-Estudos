package marcoserochajr.maratonajava.javacore.Hheranca.domain;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereco: " + this.endereco.getRua() + ", " + this.endereco.getNumero() + ", " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
