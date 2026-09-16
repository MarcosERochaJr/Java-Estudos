package marcoserochajr.maratonajava.testes.primeiro.test;

import marcoserochajr.maratonajava.testes.primeiro.domain.Equipamento;

public class EquipamentoTeste {
    public static void main(String[] args) {
        Equipamento equipamento0001 = new Equipamento("BOMBA DE ALTA PRESSÃO 1", "BL-04-01", 'C');
        Equipamento equipamento0002 = new Equipamento("BOMBA DE LATA PRESSÃO 2", "BL-04-02", 'C');
        Equipamento equipamento0003 = new Equipamento("QUEIMADOR SPRAY 1", "QM-04-01", 'C');
        Equipamento equipamento0004 = new Equipamento("QUEIMADOR SPRAY 2", "QM-04-02", 'C');
        Equipamento equipamento0005 = new Equipamento("REDUTOR LAVADORA 1", "RD-01-02", 'A');

        equipamento0001.imprimir();

        equipamento0001.setNome("BOMBA DE PRESSÃO ALTA 1");

        equipamento0001.imprimir();
    }
}
