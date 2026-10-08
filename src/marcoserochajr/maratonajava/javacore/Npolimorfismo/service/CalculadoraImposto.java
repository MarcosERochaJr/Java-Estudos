package marcoserochajr.maratonajava.javacore.Npolimorfismo.service;

import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Produto;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    /*
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
    */
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
