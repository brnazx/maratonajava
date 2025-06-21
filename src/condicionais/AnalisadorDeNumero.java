package condicionais;

import java.util.Scanner;

//impar ou par, positivo ou negativo

public class AnalisadorDeNumero {
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