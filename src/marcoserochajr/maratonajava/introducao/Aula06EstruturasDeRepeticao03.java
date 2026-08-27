package marcoserochajr.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 valores de um determinado valor e depois pare a execução. Ex 50.
    static void main(String[] args) {
        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i > 25) {
                break; // o break quebra o laço for, não pode estar dentro do if se estivesse fora do for
            }
            System.out.println(i);
        }
    }
}


