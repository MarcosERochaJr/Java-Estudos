package marcoserochajr.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args) {
        // while, do while, for
        int count = 0;

        // no while ele verifica primeiro a condição e se for verdade executa o comando
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;

        // no do-while ele executa uma vez o comando e depois verifica para poder executar novamente
        do {
            System.out.println("dentro do do-while - " + count++);
        } while (count <= 10);

        for (int i = 0; i < 10 ; i++) {
            System.out.println("For - "+ i);
        }
    }
}
