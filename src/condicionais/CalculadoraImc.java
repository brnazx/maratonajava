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
        System.out.println();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

        sc.close();
    }
}
