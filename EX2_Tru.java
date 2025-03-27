package EX11;

import static EX11.EX1_Soma.somar;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2_Tru {

    public static double somar(int n1) {

        if (n1 % 2 == 0) {
            String f1 = "True";
            System.out.println("O numero eh par " + f1);
        } else {

            String f1 = "False";
            System.out.println("O numero eh par " + f1);
        }

        return n1;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Somar dois numeros");

        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();

        somar(n1);

    }

}
