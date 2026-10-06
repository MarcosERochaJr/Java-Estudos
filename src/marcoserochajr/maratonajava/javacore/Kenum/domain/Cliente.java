package marcoserochajr.maratonajava.javacore.Kenum.domain;

public class Cliente {
    //Podemos criar uma enumeração dentro da classe direto também
//
//    public enum TipoPagamento {
//    DEBITO, CREDITO
//    }

    //Mas ainda precisamos criar o atributo
    private String nome;
    // Com a enumeração de TipoCliente fazemos esse relacionamento aqui
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    // Criamos o construtor com TipoCliente


    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome= " + nome +
                ", tipoCliente= " + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt= " + tipoCliente.getValor() +
                ", tipoPagamento= " + tipoPagamento +
                '}';
    }
}
