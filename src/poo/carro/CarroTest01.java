package poo.carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro("Ferrari", "GT3", 2025);

        System.out.println("--- Estado inicial do carro ---");
        carro.exibirDados();

        carro.acelerarAte(150);

        System.out.println("--- Estado final do carro ---");
        carro.exibirDados();

    }
}
