package condicionais;

import java.util.Locale;
import java.util.Scanner;

// Algoritmo que ler o valor de um produto e determina o valor final de acordo com a forma de pagamento

public class CalculoPrecoFinal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À Vista em Dinheiro");
        System.out.println("2 - À Vista no cartão de crédito");
        System.out.println("3 - Parcelado no cartão em duas vezes");
        System.out.println("4 -  Parcelado no cartão em três vezes ou mais");
        int formaPagamento = sc.nextInt();

        double valorFinal;

        if (formaPagamento == 1) {
            valorFinal = valorCompra * 0.85;
            System.out.printf("Valor a pagar: %.2f%n", valorFinal);
        } else if (formaPagamento == 2) {
            valorFinal = valorCompra * 0.90;
            System.out.printf("Valor a pagar: %.2f%n", valorFinal);
        } else if (formaPagamento == 3) {
            valorFinal = valorCompra;
            System.out.println("Valor a pagar: " + valorFinal);
        } else if (formaPagamento == 4) {
            valorFinal = valorCompra * 1.10;
            System.out.printf("Valor a pagar: %.2f%n", valorFinal);
        } else {
        }

            sc.close();
    }
}
