package exercicios;

import java.util.Scanner;

// ler os valores, mostrar a soma e dizer se e menor que C

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);

        if (c > soma) {
            System.out.println("Menor");
        }
        else {
            System.out.println("Maior");
        }

        sc.close();
    }
}
