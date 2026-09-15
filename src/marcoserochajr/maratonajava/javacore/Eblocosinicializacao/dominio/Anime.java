package marcoserochajr.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com os valores padrão ou o que for passado
    // 3 - O bloco de inicialização é executado
    // 4 - O construtor é executado


    // BLOCO DE INICIALIZAÇÃO - SEMPRE SERÁ EXECUTADO INDEPENDENTE DO CONSTRUTOR QUE CONSULTAR
    {
        episodios = new int[150];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
