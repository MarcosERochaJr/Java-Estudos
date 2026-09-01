package marcoserochajr.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;

    public void impressora(){
        System.out.println("----------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

    public void mediaSalarios(double n1, double n2, double n3){
        double media = (n1 + n2 + n3) / 3;
        System.out.println(media);
    }
}
