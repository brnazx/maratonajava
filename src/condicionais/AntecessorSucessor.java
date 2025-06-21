package condicionais;

import java.util.Scanner;

// ler numero inteiro - antecessor e sucessor

public class AntecessorSucessor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sucessor;
        int antecessor;

        System.out.println(x);

        if (x == 0) {
            sucessor = x + 1;
        }
        else if (x == 0){
            antecessor = x - 1;
        }
        else {
            int y = x;
            sucessor = x + 1;
            antecessor = x - 1;
            System.out.println(antecessor + " " +  y + " " + sucessor);
        }

        sc.close();
    }
}
