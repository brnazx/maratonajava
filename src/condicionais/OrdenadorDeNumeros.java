package condicionais;

import java.util.Scanner;

// algoritmo que leia tres valores e imprima com valores em ordem decrescente

public class OrdenadorDeNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            else {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            if (a > b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}