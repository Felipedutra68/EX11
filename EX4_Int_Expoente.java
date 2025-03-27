package EX11;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4_Int_Expoente {

    public static double n4(int n1, int n2) {

        int r1 = n1 * n1;

        int n3 = n2 - 2;

        int r2 = 0;
        
        if (n3 <= 0) {
        
           System.out.println("O resultado eh " + r1); 
            
        }    
            
        for (int i = 1; i <= n3; i++) {

            r2 = n1 * r1;

             System.out.println("O resultado eh " + r2);
            
        }

        return r2;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a base");
        int n1 = teclado.nextInt();

        System.out.println("Digite o expoente");
        int n2 = teclado.nextInt();

        n4(n1, n2);

    }

}
