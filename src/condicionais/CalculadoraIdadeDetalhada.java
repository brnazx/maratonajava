package condicionais;

import java.util.Scanner;

//um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos, meses e dias essa pessoa ja viveu.

public class CalculadoraIdadeDetalhada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diaAtual = 13;
        int mesAtual = 6;
        int anoAtual = 2025;

        int anos, meses, dias;


        System.out.println("\nDigite o ano que nasceu: ");
        int anoNasc = sc.nextInt();
        System.out.println("\nDigite o mes (1 ao 12) que nasceu:");
        int mesNasc = sc.nextInt();
        System.out.println("\nDigite o dia (1 ao 30) que nasceu:");
        int diaNasc = sc.nextInt();

        if (diaAtual < diaNasc) {
            diaAtual += 30;
            mesAtual -= 1;
        }
        dias = diaAtual - diaNasc;


        if (mesAtual < mesNasc) {
            mesAtual += 12;
            anoAtual -= 1;
        }
        meses = mesAtual - mesNasc;

        anos = anoAtual - anoNasc;

        System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias");

        sc.close();
    }
}
