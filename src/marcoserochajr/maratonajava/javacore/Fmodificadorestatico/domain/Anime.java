package marcoserochajr.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com os valores padrão ou o que for passado
    // 3 - O bloco de inicialização é executado
    // 4 - O construtor é executado


    // BLOCO DE INICIALIZAÇÃO - SEMPRE SERÁ EXECUTADO INDEPENDENTE DO CONSTRUTOR QUE CONSULTAR
    static {
        episodios = new int[3];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println("Um OBJETO foi CRIADO e o BLOCO DE INICIALIZAÇÃO foi EXECUTADO");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
