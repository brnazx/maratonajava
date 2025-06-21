package entrada_saida;

import java.util.Scanner;

// Faça um algoritmo que leia dois valores inteiros e imprima o quociente e o resto da divisão entre eles.

public class DivisaoComResto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int quociente = a / b;
        int resto = a % b;

        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);

        sc.close();
    }
}
