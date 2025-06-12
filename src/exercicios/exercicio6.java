package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        double reajuste = x * 1.05;

        System.out.println(reajuste);


        sc.close();
    }
}
