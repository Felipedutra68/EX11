package EX11;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4_Fahrenheit {

    public static double n4(int n1) {

        double f1 = (n1 * 9 / 5) + 32;

        System.out.println("A temperatua eh " + f1 + "Fahrenheit");

        return f1;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celcios");
        int n1 = teclado.nextInt();

        n4(n1);

    }
}
