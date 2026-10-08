package marcoserochajr.maratonajava.javacore.Npolimorfismo.test;

import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Computador;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Produto;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.domain.Tomate;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto01 = new Computador("Vivobook 15", 2500);
        Produto produto02 = new Tomate("Tomate Italiano", 5.5);
        System.out.println("Computador: " + produto01.getNome());
        System.out.println("Valor: " + produto01.getValor());
        System.out.println(produto01.calcularImposto());
        System.out.println("----------");
        System.out.println("Tomate: " + produto02.getNome());
        System.out.println("Valor: " + produto02.getValor());
        System.out.println(produto02.calcularImposto());
    }
}
