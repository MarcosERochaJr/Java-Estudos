package marcoserochajr.maratonajava.javacore.Gassociacao.domain;

public class Jogador {

    //------------------ATRIBUTOS----------------------//
    //------- Aqui definimos as características -------//

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String posicao;

    private Time time;

    //-------------------------------------------------//


    //------------------CONSTRUTOR---------------------//
    //----- Permite criar um objeto já informando -----//
    //---------------- seus atributos -----------------//

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, int idade, double altura, double peso, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
    }

    //-------------------------------------------------//


    //-------------------GETTERS-----------------------//
    //----- Cria uma forma de consultar os valores ----//
    //--------------- dos atributos -------------------//

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public Time getTime() {
        return time;
    }

    //-------------------------------------------------//


    //-------------------SETTERS-----------------------//
    //----- Cria uma forma de alterar os valores ------//
    //--------------- dos atributos -------------------//

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    //-------------------------------------------------//


    //-------------------MÉTODOS-----------------------//
    //------- Aqui definimos as ações da classe -------//

    public void imprimirJogador(){
        System.out.println("Nome: " + this.nome + " | Idade: " + this.idade + " | Altura: " + this.altura + " | Peso: " + this.peso + " | Posicao: " + this.posicao);
        if (time != null) {
            System.out.println("Time: " + time.getNome());
        }
    }

    //-------------------------------------------------//
}
