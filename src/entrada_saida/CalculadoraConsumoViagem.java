package entrada_saida;

import java.util.Locale;
import java.util.Scanner;

// Faça um algoritmo que leia o tempo gasto em horas e a velocidade média em km/h de um carro.

public class CalculadoraConsumoViagem {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o tempo gasto em horas:");
        double tempo = sc.nextDouble();
        System.out.println("Digite a velocidade média em km/h:");
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12.0;

        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.printf("Distância percorrida: %.2f km%n", distancia);
        System.out.printf("Litros de combustível usados: %.2f L%n", litrosUsados);

        sc.close();
    }
}
