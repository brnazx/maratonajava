package poo.carro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro() {
    }

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double incremento) {
        if (incremento < 0) {
            System.out.println("Incremento deve ser positivo.");
            return;
        }
        velocidadeAtual += incremento;
        System.out.printf("Velocidade atual: %.2f km/h%n", velocidadeAtual);
    }
    public void frear(double decremento) {
        if (decremento < 0) {
            System.out.println("Decremento deve ser positivo.");
            return;
        }
        if (decremento > velocidadeAtual) {
            System.out.println("Decremento maior que a velocidade atual. A velocidade será zerada.");
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
        System.out.printf("Velocidade atual: %.2f km/h%n", velocidadeAtual);
    }
    public void exibirDados(){
        System.out.printf("Marca: %s, Modelo: %s, Ano: %d, Velocidade Atual: %.2f km/h%n",
                          marca, modelo, ano, velocidadeAtual);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
