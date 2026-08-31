package marcoserochajr.maratonajava.javacore.Bintroducaometodos.teste;

import marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double retorno = calculadora.divideDoisNumeros(2,0);
        System.out.println(retorno);
        System.out.println(calculadora.divideDoisNumeros(2,0));
        System.out.println(calculadora.divideDoisNumeros02(2,0));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
