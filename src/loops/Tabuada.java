package loops;

import java.util.Scanner;

//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            int resultado = valor * i;
            System.out.printf("%d x %d = %d%n", valor, i, resultado);
        }

        sc.close();
    }
}
