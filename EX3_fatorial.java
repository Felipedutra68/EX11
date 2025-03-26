package EX11;

import static EX11.EX1_Soma.somar;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX3_fatorial {

    public static double n(int n1) {

        long r1 = 1;
        for (int i = 1; i <= n1; i++) {
            r1 *= i;
        }

        return r1;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        int r2 = (int) n(n1);

        System.out.println("A soma dos numeros eh: " + r2);

    }
}
