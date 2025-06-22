package poo.carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2020);

        carro.acelerar(50);
        carro.frear(20);
        carro.acelerar(30);

        carro.exibirDados();

    }
}
