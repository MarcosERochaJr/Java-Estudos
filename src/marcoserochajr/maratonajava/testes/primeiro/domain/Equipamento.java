package marcoserochajr.maratonajava.testes.primeiro.domain;

public class Equipamento {
    private String nome;
    private String tag;
    private char prioridade;

    public Equipamento(String nome, String tag, char prioridade) {
        this.nome = nome;
        this.tag = tag;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public char getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(char prioridade) {
        this.prioridade = prioridade;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tag: " + this.tag);
        System.out.println("Prioridade: " + this.prioridade);
    }

}
