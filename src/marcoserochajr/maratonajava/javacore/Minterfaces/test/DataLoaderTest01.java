package marcoserochajr.maratonajava.javacore.Minterfaces.test;

import marcoserochajr.maratonajava.javacore.Minterfaces.domain.DatabaseLoader;
import marcoserochajr.maratonajava.javacore.Minterfaces.domain.DataLoader;
import marcoserochajr.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        databaseLoader.load();
        fileLoader.remove();
        databaseLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DatabaseLoader.returnMaxSize();
        DataLoader.returnMaxSize();
    }
}
