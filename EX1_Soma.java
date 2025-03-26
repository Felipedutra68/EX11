package EX11;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX1_Soma {

    public static double somar(int n1, int n2) {

        return n1 + n2;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Somar dois numeros");

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        System.out.println("Digite um numero");
        int n2 = teclado.nextInt();

        int r1 = (int) somar(n1, n2);

        System.out.println("A soma dos numeros eh: " + r1);

    }
}
