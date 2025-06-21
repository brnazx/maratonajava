package entrada_saida;

import java.util.Scanner;

// Faça um algoritmo que leia dois valores inteiros e imprima o quociente e o resto da divisão entre eles.

public class DivisaoComResto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int resultado = a / b;
        int resto = a % b;

        System.out.println(" O Quociente de " + a + " dividido por " + b + " = " + resultado);
        System.out.println(" O Resto de " + a + " dividido por " + b + " = " + resto);

        sc.close();
    }
}
