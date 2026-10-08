package marcoserochajr.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public final int MAX_SIZE = 1000;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void returnMaxSize(){
        System.out.println("Dentro do método returnMaxSize na interface");
    }
}
