package marcoserochajr.maratonajava.javacore.Minterfaces.domain;

public class DataBaseLoarder implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
