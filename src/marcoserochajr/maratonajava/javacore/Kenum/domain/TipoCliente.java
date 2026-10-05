package marcoserochajr.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    // Aqui definimos as possibilidades de tipo de cliente
    // Podemos também criar atributos para os tipos, por exemplo pessoa física ser 1 e jurídica 2
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    // Ao passar atributos temos que criar um construtor e também podemos guardar esse valor em uma variável que obrigatóriamente tem que vir depois das enumerações
    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
