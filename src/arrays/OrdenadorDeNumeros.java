package arrays;

import java.util.Arrays;
import java.util.Scanner;

// algoritmo que leia tres valores e imprima com valores em ordem decrescente

public class OrdenadorDeNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite tres valores inteiros:");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        int[] numeros = {valor1, valor2, valor3};
        Arrays.sort(numeros);

        System.out.println("Valores em ordem decrescente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i] + " ");
        }

        sc.close();
    }
}