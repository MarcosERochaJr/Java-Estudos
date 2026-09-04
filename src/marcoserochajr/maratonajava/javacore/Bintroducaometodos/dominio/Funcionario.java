package marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;


    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario: this.salarios) {
            System.out.print(salario + " ");
        }
        mediaSalarios();
    }

    public void mediaSalarios(){
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario: this.salarios) {
            media = media + salario;
        }
        media /= salarios.length;
        System.out.println("\nMedia salarial: " + media);
    }
}
