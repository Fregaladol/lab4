import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* EXTRA: En un bucle, según la cantidad de veces que indica el usuario, se va pidiendo una letra cada vez, y se van guardando todas las letras juntas en una variable String. Ejemplo, el usuario entra los char: a, l, m, e, n, d, r, o, y se imprime al final el String "almendro" (hay que investigar para conseguir hacer el cambio de tipo) */

       
        Scanner scanner = new Scanner(System.in);
        Character randomCharacter;
        String word = "";

        System.out.println("Dime el número de letras que vas a darme.");
        int numberTimes = scanner.nextInt();
        scanner.nextLine();
        
        for (int i=1; i <= numberTimes;i++){
            
            System.out.println("Dame una letra.");
            randomCharacter = scanner.next().charAt(0);
            
            System.out.printf("has escrito: %s. Te quedan %d letras por introducir.\n", randomCharacter,(numberTimes)-i);

            word += randomCharacter; 
        }

        System.out.printf("La palabra que has creado con los %d caracteres es: %s .\n", numberTimes,word);

        System.out.println("La palabra es del tipo " + word.getClass().getName());

        scanner.close();


    }
}
