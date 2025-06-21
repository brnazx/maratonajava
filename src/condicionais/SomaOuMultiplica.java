package condicionais;

import java.util.Scanner;

// ler 2 numeros inteiros, somar ou mutiplicar e imprimir o resultado

public class SomaOuMultiplica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números inteiros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        int soma = a + b;
        int mult = a * b;

        if (a == b) {
            c = soma;
            System.out.println("SOMA DE A + B = " + c);
        }
        else {
            c = mult;
            System.out.println("MULTIPLICAÇÃO DE A x B = " + c);
        }
        System.out.println(c);

        sc.close();
    }
}
