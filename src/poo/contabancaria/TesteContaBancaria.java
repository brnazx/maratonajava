package poo.contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Bruno");
        conta.setNumeroConta("123456789");

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.printf("Saldo Inicial: R$ %.2f%n", conta.getSaldo());

        System.out.print("\nInforme o valor que deseja depositar: ");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);

        conta.exibirSaldo();

        System.out.print("\nInforme o valor que deseja sacar: ");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

        conta.exibirSaldo();

        sc.close();
    }
}
