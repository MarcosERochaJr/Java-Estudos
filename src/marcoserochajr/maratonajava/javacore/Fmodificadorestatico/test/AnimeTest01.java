package marcoserochajr.maratonajava.javacore.Fmodificadorestatico.test;

import marcoserochajr.maratonajava.javacore.Fmodificadorestatico.domain.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();

        anime1.setNome("Naruto");
        anime2.setNome("Death Note");
        anime3.setNome("Ousama Ranking");

        System.out.println("Nome: " + anime1.getNome());
        System.out.println("Episódios: " + Arrays.toString(anime1.getEpisodios()));
        System.out.println("Nome: " + anime2.getNome());
        System.out.println("Episódios: " + Arrays.toString(anime2.getEpisodios()));
        System.out.println("Nome: " + anime3.getNome());
        System.out.println("Episódios: " + Arrays.toString(anime3.getEpisodios()));
    }
}
