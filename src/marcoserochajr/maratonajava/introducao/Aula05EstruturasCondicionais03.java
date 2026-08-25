package marcoserochajr.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Eu ainda não tenho o dinheiro, mas vou ter!";
        String resultado;

        /* MODO IF ELSE
        if (salario >= 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);
        */

        // MODO OPERADOR TERNÁRIO
        // resultado = (condição) ? verdadeiro : falso
        resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
