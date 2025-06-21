package condicionais;

import java.util.Scanner;

//Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

public class VerificadorBooleano {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        boolean valor1 = sc.nextBoolean();
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2){
            System.out.println("Ambos sao verdadeiros.");
        } else if (!valor1 && !valor2){
            System.out.println("Ambos sao falsos.");
        } else {
            System.out.println("Ambos sao diferentes.");
        }

        sc.close();
    }
}