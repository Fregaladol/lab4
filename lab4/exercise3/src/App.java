import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 3- Se introduce una frase y se devuelve  el texto 
        a la inversa. Ejemplo: olpmejE */

        Scanner scanner = new Scanner(System.in);
        String drow = "";

        System.out.println("Dame una palabra y te la devuelvo al reves");
        String word = scanner.nextLine();

         for (int i = word.length() - 1; i >= 0; i--) {
            drow = drow + word.charAt(i);
        }

        System.out.printf("Tu palabra al reves es: %s", drow);
    
        scanner.close();
    }
}
