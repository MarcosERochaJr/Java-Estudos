package marcoserochajr.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {

    static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[][] arrayInt = new int[3][]; //Aqui está sendo definido um array de 3 posições, mas não foi passado quantas posições terão os arrays que ele faz referência
        // então agora posso passar quantas posições quero que cada um dos 3 tenha
        // e também posso incializar o array ou então passar um array já inicializado

        arrayInt[0] = new int[1];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        // Dá também para inicializar diretamente arrays multidimensionais

        int[][] arrayInt2 = {{0}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6, 7, 8}};

        // Tanto arrayInt e arrayInt2 retornam os mesmos valores

        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            System.out.println("\n--");
        }
    }
}
