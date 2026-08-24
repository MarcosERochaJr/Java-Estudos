package marcoserochajr.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    static void main() {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoólica"); //Só vai aparecer essa mensagem se dentro de () for true
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar bebida alcoólica"); //Só vai aparecer essa mensagem se dentro de () for true
        }
    }
}
