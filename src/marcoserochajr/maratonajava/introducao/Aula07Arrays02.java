package marcoserochajr.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // Se eu criar um array e não passar valores para alocar na memória ele retornará o padrão
        // byte, short, int, long, float e double = 0
        // char = '\u0000' que é vazio
        // String = null

        String[] nomes = new String[3];
        nomes[0] = "Marcos";
        nomes[1] = "Amanda";
        nomes[2] = "Julia";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }

}
