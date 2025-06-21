package loops;

//Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class TabuadaCompleta {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <=10; j++) {
                int resultado = i * j;
                System.out.printf("%d x %d = %d%n", i, j, resultado);
            }
        }
    }
}
