package marcoserochajr.maratonajava.javacore.Gassociacao.test;

import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Jogador;
import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador = new Jogador("Marcos");
        Jogador jogador2 = new Jogador("Luis");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,  jogador2};
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprimirJogador();
        jogador2.imprimirJogador();
        System.out.println("------Time-----");
        time.imprimir();
    }
}
