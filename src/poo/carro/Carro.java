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
    public void acelerarAte(double velocidadeAlvo){
        System.out.printf("Acelerando o carro até %.2f km/h...%n", velocidadeAlvo);
        while (this.velocidadeAtual < velocidadeAlvo) {
            this.velocidadeAtual += 10;
            if (this.velocidadeAtual > velocidadeAlvo) {
                this.velocidadeAtual = velocidadeAlvo;
            }
            System.out.printf("Velocidade atual: %.2f km/h%n", this.velocidadeAtual);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Aceleração interrompida.");
                Thread.interrupted();
                break;
            }
        }
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
