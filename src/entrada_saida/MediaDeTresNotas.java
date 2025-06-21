package entrada_saida;

import java.util.Locale;
import java.util.Scanner;

//ler tres notas e dps imprimir na tela a media das notas

public class MediaDeTresNotas {
    public static void main(String[] args) {

        Locale.setDefault( Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Media = %.2f%n", media);


        sc.close();


    }
}
