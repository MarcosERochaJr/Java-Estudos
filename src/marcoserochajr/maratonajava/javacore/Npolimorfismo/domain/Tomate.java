package marcoserochajr.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public final double IMPOSTO_TOMATE = 0.01;
    private String dataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_TOMATE;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
