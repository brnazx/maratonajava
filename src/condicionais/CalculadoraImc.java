package condicionais;

import java.util.Locale;
import java.util.Scanner;

// Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
public class CalculadoraImc {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double IMC = 0;

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        double alturaElevada = Math.pow(altura, 2);
        IMC = peso / alturaElevada;

        if (IMC <= 18.5) {
            System.out.printf("Abaixo do peso!" + " IMC: " + String.format("%.1f", IMC));
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.printf("Peso normal" + " IMC: " + String.format("%.1f", IMC));
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.printf("Levemente acima do peso" + " IMC: " + String.format("%.1f", IMC));
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.printf("Obesidade grau 1" + " IMC: " + String.format("%.1f", IMC));
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.printf("Obesidade grau 2" + " IMC: " + String.format("%.1f", IMC));
        } else {
            System.out.print("Obesidade grau 3" + " -- IMC: " + String.format("%.1f", IMC));
        }

        sc.close();
    }
}
