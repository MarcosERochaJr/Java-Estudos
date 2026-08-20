package marcoserochajr.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 25.0F;
        long numeroGrande = 999999;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 120;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Marcos";

        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println(salarioDouble);
        System.out.println(salarioFloat);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(nome);

    }
}
