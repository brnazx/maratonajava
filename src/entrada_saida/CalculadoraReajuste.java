package entrada_saida;

import java.util.Locale;
import java.util.Scanner;

// Faça um algoritmo que leia um valor X e imprima o valor de X com 5% de reajuste.

public class CalculadoraReajuste {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        double x = sc.nextDouble();
        double reajuste = x *.05;
        double resultado = x + reajuste;

        System.out.printf("O valor com reajuste é: %.2f" , resultado);

        sc.close();
    }
}
