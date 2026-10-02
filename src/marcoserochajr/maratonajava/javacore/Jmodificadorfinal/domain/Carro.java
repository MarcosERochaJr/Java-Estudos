package marcoserochajr.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double CONSTANTE_VELOCIDADE_LIMITE;

    static {
        CONSTANTE_VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
