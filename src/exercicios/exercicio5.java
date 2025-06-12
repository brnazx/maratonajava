package exercicios;

import java.util.Scanner;

// ler o salario e calcular quantos salarios minimos recebe

public class exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;
        double salario = sc.nextDouble();

        double quantidadeSalario = salario / salarioMinimo;

        System.out.printf("%.2f ", quantidadeSalario);

        sc.close();
    }
}
