package loops;

import java.util.Locale;

//Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima na tela em quantos anos serão necessários para que Francisco seja maior que Sara.

public class CalculadoraCrescimento {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int anos = 0;
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        double crescimentoFrancisco = 0.02;
        double crescimentoSara = 0.03;

        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += crescimentoFrancisco;
            alturaSara += crescimentoSara;
            anos++;
        }
        System.out.println("Serao necessarios " + anos + " anos");
    }
}
