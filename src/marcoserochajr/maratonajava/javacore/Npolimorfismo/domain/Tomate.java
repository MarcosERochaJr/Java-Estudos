package marcoserochajr.maratonajava.javacore.Npolimorfismo.domain;

public class Tomate extends Produto {
    public final double IMPOSTO_TOMATE = 0.01;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_TOMATE;
    }
}
