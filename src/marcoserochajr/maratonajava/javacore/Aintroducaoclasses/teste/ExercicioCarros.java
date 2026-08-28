package marcoserochajr.maratonajava.javacore.Aintroducaoclasses.teste;

import marcoserochajr.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class ExercicioCarros {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Onix";
        carro1.modelo = "2024";
        carro1.ano = 2023;

        carro2.nome = "BMW X6";
        carro2.modelo = "2026";
        carro2.ano = 2025;

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);
        System.out.println("------------------");
        System.out.println("Carro 2: ");
        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
