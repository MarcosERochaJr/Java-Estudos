package marcoserochajr.maratonajava.testes.primeiro.domain;



public class OrdemManutencao {
    private int idOrdemManutencao;
    private String descricao;
    private Equipamento equipamento;
    private boolean concluida = false;

    public OrdemManutencao(int idOrdemManutencao, String descricao, Equipamento equipamento) {
        this.idOrdemManutencao = idOrdemManutencao;
        this.descricao = descricao;
        this.equipamento = equipamento;
    }

    public void imprimirOrdem(){
        System.out.println(this.idOrdemManutencao);
        System.out.println(this.descricao);
        equipamento.imprimirEquipamento();
        System.out.println(this.concluida);
    }

    public void iniciarOrdem(){
        if(this.concluida){
            return;
        }
        if (equipamento.isEmManutencao()) {
            return;
        }
            equipamento.iniciarManutencao();
    }

    public void finalizarOrdem(){
        if(this.concluida){
            return;
        }
        if (!equipamento.isEmManutencao()) {
            return;
        }
            equipamento.finalizarManutencao();
            this.concluida = true;
    }
}
