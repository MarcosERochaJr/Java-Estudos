package marcoserochajr.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado o valor de um carro, mostre as parcelas possíveis para o parcelamento
    // Onde o valor da parcela deve ser >= 1000.
    static void main(String[] args) {
        double valorCarro = 40002;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Em "+ parcela + " parcelas de R$ "+valorParcela);
        }
    }
}
