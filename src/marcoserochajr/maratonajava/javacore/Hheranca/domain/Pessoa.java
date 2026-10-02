package marcoserochajr.maratonajava.javacore.Hheranca.domain;

public class Pessoa {

    // O protected irá permitir que outras as classes extendidas acessem os atributos diretamente com this.atributos
    // E também todas as outras classes do mesmo pacote, mas não classes de outros pacotes
    protected String nome;
    protected int idade;
    protected Endereco endereco;

    /*
    private String nome;
    private int idade;
    private Endereco endereco;
    */

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereco: " + this.endereco.getRua() + ", " + this.endereco.getNumero() + ", " + this.endereco.getCep());
    }

    static {
        System.out.println("Dentro do bloco inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização 1 de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização 2 de Pessoa");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
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
