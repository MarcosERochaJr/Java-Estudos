package marcoserochajr.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
*/


public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {
        String nome = "Marcos Elias Rocha Junior";
        String endereco = "Avenida Santa Cruz, 3255";
        double salario = 2886.4;
        String data = "31/08/2026";

        System.out.print("Eu " + nome+ ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario +", na data " + data);
    }
}
