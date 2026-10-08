package marcoserochajr.maratonajava.javacore.Npolimorfismo.test;

import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Televisao;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook M5 Pro", 20000);
        Tomate tomate = new Tomate("Tomate Carmen", 5);
        Televisao televisao = new Televisao("Samsung 58\"",2400);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
