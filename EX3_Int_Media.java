package EX11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX3_Int_Media {

    public static double somar(int n1, ArrayList<Integer> nomes2) {

        int soma = 0;

        for (int num : nomes2) {

            soma += num;
        }

        int r1 = soma / 7;

        System.out.println("A media dos numeros digitados eh " + r1);

        return n1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        ArrayList<Integer> nomes2 = listaDeNomes;

        int n1 = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();
            listaDeNomes.add(n1);
        }

        somar(n1, nomes2);

    }

}
