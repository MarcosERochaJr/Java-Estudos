package marcoserochajr.maratonajava.javacore.Jmodificadorfinal.domain;


// Se eu colocar final na classe eu estou impedindo que ela seja estendida.
public /*final*/ class Carro {
    private String nome;
    // O final é usado para definir uma constante. Esse valor não pode ser mudado após inicializado.
    public static final double CONSTANTE_VELOCIDADE_LIMITE;

    static {
        CONSTANTE_VELOCIDADE_LIMITE = 250;
    }

    // Se eu utilizar o final aqui, então o método não pode ser sobrescrito
    public final void imprime(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
