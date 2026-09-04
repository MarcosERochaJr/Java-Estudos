package marcoserochajr.maratonajava.javacore.Csobrecargametodos.teste;

import marcoserochajr.maratonajava.javacore.Csobrecargametodos.domino.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
        anime.imprime();
    }
}
