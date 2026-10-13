package marcoserochajr.maratonajava.javacore.Npolimorfismo.test;

import marcoserochajr.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.service.RepositorioArquivo;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import marcoserochajr.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

public class RepositorioTeste {
    static void main(String[] args) {
        //RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        // Se criarmos o objeto utilizando a classe genérica, que no caso é a interface, podemos fazer referência a classes mais específicas
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
