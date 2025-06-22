package poo.aluno;

import java.util.Locale;
import java.util.Scanner;

public class AlunoTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("\nInforme o nome do aluno: ");
        aluno.setNome(sc.nextLine());
        System.out.print("\nInforme a matrícula do aluno: ");
        aluno.setMatricula(sc.nextLine());

        System.out.println("\nInforme as notas do aluno: ");
        aluno.setNotas(new double[3]);
        for (int i = 0; i < aluno.getNotas().length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            aluno.getNotas()[i] = sc.nextDouble();
        }

        aluno.calcularMedia(aluno.getNotas());
        aluno.verificarAprovacao(aluno.getNotas());
        sc.close();
    }
}
