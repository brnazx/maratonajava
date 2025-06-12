package exercicios;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        if (n > 0) {
            System.out.println("POSITIVO");
        }
        else if (n < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("ZERO");
        }

        sc.close();
    }
}