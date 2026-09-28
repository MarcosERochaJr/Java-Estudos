package marcoserochajr.maratonajava.javacore.Gassociacao.Zexercicio.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor[] professores;
    private Local endereco;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Professor[] professores, Local endereco) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professores = professores;
        this.endereco = endereco;
    }

    public void imprimirSeminario() {
        System.out.println("------------------------------------------------------------");
        System.out.println("Nome: " + this.titulo);
        System.out.println("Local: " + endereco.getEndereco());
        if (this.professores != null) {
            System.out.println("### Professores Palestrantes ###");
            for (Professor professor : this.professores) {
                System.out.println("Nome: " + professor.getNome() + " | Especialidade: " + professor.getEspecialidade());
            }
        }
        if (this.alunos != null) {
            System.out.println("### Alunos Inscritos ###");
            for (Aluno aluno : this.alunos) {
                System.out.println("Nome: " + aluno.getNome() + " | Idade: " + aluno.getIdade());
            }
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
