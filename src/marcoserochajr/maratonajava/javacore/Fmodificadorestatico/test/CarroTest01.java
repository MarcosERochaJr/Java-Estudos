package marcoserochajr.maratonajava.javacore.Fmodificadorestatico.test;

import marcoserochajr.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {
//        Carro c1 = new Carro("BMW", 280);
//        Carro c2 = new Carro("Mercedes", 275);
//        Carro c3 = new Carro("Audi", 290);

//        c1.velocidadeLimite = 280; Isso aqui funciona, mas em termos de código não deixa claro que estou alterando um atributo estático para todos os objetos.
        // O correto é fazer dessa forma, passar a Classe.atributo recebendo o novo valor. Assim fica claro que aquele atributo de todos os objetos estão sendo trocados naquela Classe.
        // Carro.velocidadeLimite = 180;
//        c1.imprime();
//        c2.imprime();
//        c3.imprime();

        //Aqui eu nem preciso de ter os objetos. Apenas passar o novo valor para o atributo já funciona, pois estou mexendo em um atributo da classe e não de objeto


//        System.out.println(Carro.velocidadeLimite); // Imprimindo o valor estático para a classe referente a velocidadeLimite
//        Carro.velocidadeLimite = 180;               // Alterando o valor estático da classe para 180
//        System.out.println(Carro.velocidadeLimite); // Imprimindo o novo valor estático para a classe referente a velocidadeLimite

        Carro.setVelocidadeLimite(230); // Agora com o velocidadeLimite private e estático eu consigo usar o set
        System.out.println(Carro.getVelocidadeLimite()); // E aqui consigo pegar esse valor
        Carro.setVelocidadeLimite(200);
        System.out.println(Carro.getVelocidadeLimite());
    }
}
