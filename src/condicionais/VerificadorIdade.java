package condicionais;

import java.util.Scanner;

// algoritmo que ler nome e a idade de uma pessoa, depois imprime na tela se e maior ou menor de idade

public class VerificadorIdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("\nDigite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.printf("Seu nome é %s, e voce é maior de idade", nome);
        } else {
            System.out.printf("Seu nome é %s, e voce é menor de idade", nome);
        }

        sc.close();
    }
}
