package entrada_saida;

import java.util.Scanner;

// ler o salario e calcular quantos salarios minimos recebe

public class CalculadoraSalarioMinimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.println("Digite o salário:");
        double salario = sc.nextDouble();

        double totalSalario = salario / salarioMinimo;

        System.out.printf("%.2f ", totalSalario);

        sc.close();
    }
}
