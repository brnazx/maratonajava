package exercicios;

import java.util.Locale;
import java.util.Scanner;
//Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.

public class Exercicio16 {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US);
        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Digite a temparatura em farenheit: ");
        double farenheit = sc.nextDouble();

        celsius = (5.0 * (farenheit - 32)) / 9;

        System.out.printf( "Temperatura em Celsius: %.2f%n", celsius);
        System.out.printf( "Temperatura em Farenheit: %.2f%n", farenheit);

        sc.close();
    }
}
