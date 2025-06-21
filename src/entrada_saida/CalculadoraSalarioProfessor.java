package entrada_saida;

import java.util.Locale;
import java.util.Scanner;

// Faça um algoritmo que leia o número de aulas dadas por um professor em um mês e calcule o salário líquido do professor.

public class CalculadoraSalarioProfessor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorHoraAula = 50.0;
        int numeroAulas;
        double percentualINSS = 11.0;

        System.out.println("Digite o número de aulas dadas no mês:");
        numeroAulas = sc.nextInt();

        double salarioBruto = valorHoraAula * numeroAulas;
        double descontoINSS = salarioBruto * (percentualINSS / 100.0);

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.printf("Salário bruto: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
