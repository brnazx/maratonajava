package entrada_saida;

import java.util.Scanner;

// Faça um algoritmo que leia um valor X e imprima o valor de X com 5% de reajuste.

public class CalculadoraReajuste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double reajuste = x * 1.05;

        System.out.println(reajuste);


        sc.close();
    }
}
