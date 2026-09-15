package marcoserochajr.maratonajava.javacore.Eblocosinicializacao.test;

import marcoserochajr.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()){
            System.out.println("Episodio: " + episodio);
        }
    }
}
