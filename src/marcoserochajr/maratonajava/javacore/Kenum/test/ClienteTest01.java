package marcoserochajr.maratonajava.javacore.Kenum.test;

import marcoserochajr.maratonajava.javacore.Kenum.domain.Cliente;
import marcoserochajr.maratonajava.javacore.Kenum.domain.TipoCliente;
import marcoserochajr.maratonajava.javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    static void main(String[] args) {
        //Dessa forma temos inconsistência de dados
        /*
        Cliente cliente01 = new Cliente("Marcos", "PESSOA_FISICA");
        Cliente cliente02 = new Cliente("Marcos", "PESSOA_JURIDICA");
        Cliente cliente03 = new Cliente("Marcos", "pessoa_fisica");
        Cliente cliente04 = new Cliente("Marcos", "Pessoa_Juridica");
         */

        // Agora com enumeração temos controle da forma que iremos passar o tipo do cliente. Só tem os tipos disponíveis no enum
        Cliente cliente01 = new Cliente("Marcos", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Amanda", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Juridica");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);
    }
}
