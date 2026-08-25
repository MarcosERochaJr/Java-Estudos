package marcoserochajr.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //Exercício para calcular o valor de imposto sobre o salário anual na Holanda
    static void main(String[] args) {
        double salarioAnual = 70000;
        String TaxaDoAmor;


        if (salarioAnual < 34712) {
            salarioAnual *= 0.097;
            TaxaDoAmor = "Você terá que pagar de imposto: " + salarioAnual;
        } else if (salarioAnual >= 34713 && salarioAnual < 68507) {
            salarioAnual *= 0.3735;
            TaxaDoAmor = "Você terá que pagar de imposto: " + salarioAnual;
        } else {
            salarioAnual *= 0.4950;
            TaxaDoAmor = "Você terá que pagar de imposto: " + salarioAnual;
        }
        System.out.println(TaxaDoAmor);
    }
}
