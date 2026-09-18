package marcoserochajr.maratonajava.testes.primeiro.test;

import marcoserochajr.maratonajava.testes.primeiro.domain.Equipamento;
import marcoserochajr.maratonajava.testes.primeiro.domain.OrdemManutencao;

public class EquipamentoTeste {
    public static void main(String[] args) {
        Equipamento equipamento001 = new Equipamento("Lavadora Industrial", "BL-04-01", 1250);
        Equipamento equipamento002 = new Equipamento("Esterilizador", "BL-12-01", 850);


        OrdemManutencao ordemManutencao01 = new OrdemManutencao(1, "Troca de rolamento", equipamento001);
        OrdemManutencao ordemManutencao02 = new OrdemManutencao(2, "Inspeção preventiva", equipamento002);

        ordemManutencao01.imprimirOrdem();
        ordemManutencao01.iniciarOrdem();
        ordemManutencao01.imprimirOrdem();
        ordemManutencao01.finalizarOrdem();
        ordemManutencao01.imprimirOrdem();

    }
}
