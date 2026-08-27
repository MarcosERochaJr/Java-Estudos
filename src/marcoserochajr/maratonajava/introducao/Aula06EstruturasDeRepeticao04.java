package marcoserochajr.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, mostre as parcelas possíveis para o parcelamento
    // Onde o valor da parcela deve ser >= 1000.
    static void main(String[] args) {
        double valorCarro = 40000;
        int vezesParcelado = (int) valorCarro / 1000;

        System.out.println("O carro no valor de "+ valorCarro + " pode ser parcelado em até " + vezesParcelado + " vezes.");
        System.out.println("Seguem as parcelas possíveis:");

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Em "+ parcela + " parcelas de R$ "+valorParcela);
        }
    }
}
