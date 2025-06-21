package entrada_saida;

import java.util.Random;

// Faça um algoritmo que gere um número aleatório entre 0 e 100 e o imprima na tela.

public class GeradorNumeroAleatorio {
    public static void main(String[] args) {

        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);

        System.out.println(numeroAleatorio);

    }
}
