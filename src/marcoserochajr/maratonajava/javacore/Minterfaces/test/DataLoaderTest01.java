package marcoserochajr.maratonajava.javacore.Minterfaces.test;

import marcoserochajr.maratonajava.javacore.Minterfaces.domain.DataBaseLoarder;
import marcoserochajr.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DataBaseLoarder databaseLoader = new DataBaseLoarder();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        databaseLoader.load();
    }
}
