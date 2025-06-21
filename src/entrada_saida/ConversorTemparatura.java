package entrada_saida;

import java.util.Locale;
import java.util.Scanner;
//Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.

public class ConversorTemparatura {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US);
        Scanner sc = new Scanner(System.in);

        double C, F;

        System.out.print("Digite a temparatura em farenheit: ");
        F = sc.nextDouble();

        C = (5.0 * (F - 32)) / 9;

        System.out.printf( "Temperatura em Celsius: %.2f%n", C);
        System.out.printf( "Temperatura em Farenheit: %.2f%n", F);

        sc.close();
    }
}
