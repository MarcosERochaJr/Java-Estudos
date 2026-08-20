package marcoserochajr.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula04Operadores {
    static void main(String[] args) {

        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 + numero02;

        System.out.println(numero01 + numero02 + " - Soma");
        System.out.println(numero01 - numero02 + " - Subtração");
        System.out.println(numero01 * numero02 + " - Multiplicação");
        System.out.println(numero01 / numero02 + " - Divisão. O resultado entre dois valores inteiros sempre será um valor inteiro. Por isso caso as variáveis n1 e n2 estejam como int o resultado será 0");
        System.out.println(resultado + " Também é possível armazenar o resultado em uma variável e mostrar a variável direto");
    }
}
