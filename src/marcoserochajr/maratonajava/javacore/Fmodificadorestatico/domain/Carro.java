package marcoserochajr.maratonajava.javacore.Fmodificadorestatico.domain;

//Cria a classe carro
public class Carro {
    //Cria os atributos
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite =  250;
    // Ao colocar o static eu indico que esse atributo é para todos os objetos.
    // Então se eu alterar a velocidade limite de um objeto para X, X se replicará para todos os outros dali em diante.


    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("---------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
