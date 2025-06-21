package condicionais;

import java.util.Scanner;

// ler 2 numeros inteiros, somar ou mutiplicar e imprimir o resultado

public class SomaOuMultiplica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        int soma = a + b;
        int mult = a * b;
        if (a == b) {
            c = soma;
        }
        else {
            c = mult;
        }
        System.out.println(c);

        sc.close();
    }
}
