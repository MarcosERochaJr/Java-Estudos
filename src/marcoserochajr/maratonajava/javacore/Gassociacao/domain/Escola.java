package marcoserochajr.maratonajava.javacore.Gassociacao.domain;

public class Escola {
    private String nome;
    private Professor[] professores;


    // Construtor
    public Escola(String nome) {
        this.nome = nome;
    }

    // Sobrecarga do construtor, dando a possibilidade de passar professor dentro da escola
    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (professores == null){
            return;
        }
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
