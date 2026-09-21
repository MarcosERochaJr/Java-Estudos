package marcoserochajr.maratonajava.javacore.Gassociacao.test;

import marcoserochajr.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        //Aqui estamos criando os objetos jogadores, criamos 3 objetos e como temos construtores passamos os atributos na criação do objeto
        Jogador jogador1 = new Jogador("Ronaldinho", 25, 1.78, 76, "Atacante");
        Jogador jogador2 = new Jogador("Kaká", 34, 1.86, 79, "Meio Campo");
        Jogador jogador3 = new Jogador("Ronaldo", 40, 1.75, 94, "Volante");

        //Aqui criamos um array para guardar os objetos (jogadores) criados
        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};



        //Aqui estamos imprimindo os jogadores guardados no array
        for (Jogador jogador : jogadores){
            jogador.imprimirJogador();
        }
    }
}
