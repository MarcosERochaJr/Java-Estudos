package marcoserochajr.maratonajava.javacore.Dconstrutores.teste;

import marcoserochajr.maratonajava.javacore.Dconstrutores.domino.Anime;

public class AnimeTeste01 {
    static void main(String[] args) {
        Anime anime = new Anime("Haikiu", "TV", 12, "Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
