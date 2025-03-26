
package EX11;

import java.util.Scanner;

/**
 *
 * @author ADM
 */

public class EX5_Vogais {
    
 public static String n4(String n1) {
     int c = 0;
     
     for (int i = 0; i < n1.length(); i++) {
     
         char n = n1.charAt(i);
         
     if (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u') {
         c++;
     }
}
        System.out.println("Nesta palavra contem " + c + " vogais");
        
        return n1 ;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String n1 = teclado.nextLine();
        
        
         n4(n1);

    }   
    

}
