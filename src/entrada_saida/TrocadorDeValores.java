package entrada_saida;

import java.util.Scanner;

// algoritmo que recebe um valor A e B, e troca o valor de A por B e o valor de B por A

public class TrocadorDeValores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        a = b;
        b = a;

        System.out.println( "A = " + a + " B = " + b);

        sc.close();
    }
}
