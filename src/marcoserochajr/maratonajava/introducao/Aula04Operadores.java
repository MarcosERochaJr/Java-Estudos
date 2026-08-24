package marcoserochajr.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    static void main(String[] args) {

        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;


        // + - / *
        System.out.println(numero01 + numero02 + " - Soma");
        System.out.println(numero01 - numero02 + " - Subtração");
        System.out.println(numero01 * numero02 + " - Multiplicação");
        System.out.println(numero01 / numero02 + " - Divisão. O resultado entre dois valores inteiros sempre será um valor inteiro. Por isso caso as variáveis n1 e n2 estejam como int o resultado será 0");
        System.out.println(resultado + " Também é possível armazenar o resultado em uma variável e mostrar a variável direto");

        // %
        int resto = 21 % 2;
        System.out.println(resto + " - Resto da divisão. Se o resto da divisão de um número por 2 for 0 então ele é par, se for 1 ele é ímpar");

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("IsDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDeVinte "+isDezDiferenteDeVinte);

        // && (AND) || (OR) ! (NOT)
        int idade = 25;
        float salario = 2886F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStationCinco = 5000;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente >= valorPlayStationCinco || valorTotalContaPoupanca >= valorPlayStationCinco;
        System.out.println("isPlayStationCincoCompravel "+ isPlayStationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        System.out.println(bonus);
        bonus = bonus + 1000;
        System.out.println(bonus);
        bonus += 1000;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // contador recebe contador +1
        contador ++; //contador tbm recebe o incremento de 1
        --contador;
        System.out.println(--contador);
    }
}
