package EX11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2_Int_Crescente {

    public static double somar(int n1, ArrayList<Integer> nomes2) {
         
        Collections.sort(nomes2);
        
         
 

         
        return n1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        ArrayList<Integer> nomes2 = listaDeNomes;
        
        int n1 = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite um numero");
            n1 = teclado.nextInt();
            listaDeNomes.add(n1);
        }

        somar(n1, nomes2);

          for (Integer nome2 : nomes2) {

            System.out.println(nome2);

        }

         
    }
}
