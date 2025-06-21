package arrays;

import java.util.Locale;
import java.util.Scanner;

// Faça um algoritmo que leia as notas de 4 provas de um aluno, calcule a média final e imprima o resultado.

public class MediaFinalAluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int NUMERO_PROVAS = 4;

        double[] notas = new double[NUMERO_PROVAS];
        double somaNotas = 0.0;

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("\nDigite as "+ NUMERO_PROVAS + " notas");
        for (int i = 0; i < NUMERO_PROVAS; i++) {
            System.out.printf("Nota " + (i + 1) + ": ");
            String linha = sc.nextLine();
            notas[i] = Double.parseDouble(linha);
            somaNotas += notas[i];
        }

        double mediaFinal = somaNotas / NUMERO_PROVAS;

        if (mediaFinal >= 7.0) {
            System.out.printf("Aluno %s APROVADO com média final: %.2f\n", nome, mediaFinal);
        } else {
            System.out.printf("Aluno %s REPROVADO com média final: %.2f\n", nome, mediaFinal);
        }

        sc.close();
    }
}
