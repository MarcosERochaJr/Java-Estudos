package marcoserochajr.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader,  DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando dados do banco de dados");
    }

    public static void returnMaxSize(){
        System.out.println("Dentro do método returnMaxSize na classe DataBaseLoarder");
    }
}
