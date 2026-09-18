package marcoserochajr.maratonajava.testes.primeiro.domain;

public class Equipamento {
    private String nome;
    private String tag;
    private double horasFuncionamento;
    private boolean emManutencao = false;

    public Equipamento(String nome, String tag, double horasFuncionamento) {
        this.nome = nome;
        this.tag = tag;
        this.horasFuncionamento = horasFuncionamento;
    }

    public void imprimirEquipamento(){
        System.out.println("| " + nome + " | " + tag + " | " + horasFuncionamento + " | " + emManutencao + " |");
    }

    public void iniciarManutencao(){
        if (!emManutencao){
            emManutencao = true;
        }
    }

    public void finalizarManutencao() {
        emManutencao = false;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarHorasFuncionamento(double horas){
        if (horas > 0){
            this.horasFuncionamento += horas;
        }
    }

    public String getTag() {
        return tag;
    }

    public double getHorasFuncionamento() {
        return horasFuncionamento;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
