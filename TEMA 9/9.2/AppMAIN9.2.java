import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Lista c = new Lista();
        System.out.println("Introducir número:");
        Integer n = new Scanner(System.in).nextInt();

        while (n >= 0) {
         c.encolar(n);
         System.out.println("Introducir número:");
         n = new Scanner(System.in).nextInt();
 
        }
        n = c.desencolar();
        while (n != null) {
         System.out.println(n+"" );
         n = c.desencolar();
 
        }
        System.out.println("");



    }
}