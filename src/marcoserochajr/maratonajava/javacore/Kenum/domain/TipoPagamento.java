package marcoserochajr.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // O método abstract foi colocado então não pode ter corpo. Ele é usado para sobrescrever
    public abstract double calcularDesconto(double valor);
}
