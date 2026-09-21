package marcoserochajr.maratonajava.javacore.Gassociacao.test;

import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Jogador;
import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé", 40, 1.75, 78, "Atacante");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprimirJogador();
    }
}
