import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       /*  6- En un bucle, según la cantidad de veces que indica el usuario, se va pidiendo una letra cada vez, y se imprime: "has escrito A", "has escrito m", etc */
       
        Scanner scanner = new Scanner(System.in);
        Character randomCharacter;

        System.out.println("Dime el número de letras que vas a darme.");
        int numberTimes = scanner.nextInt();
        scanner.nextLine();
        
        for (int i=1; i <= numberTimes;i++){
            
            System.out.println("Dame una letra.");
            randomCharacter = scanner.next().charAt(0);
            
            System.out.printf("has escrito: %s. Te quedan %d letras por introducir.\n", randomCharacter,(numberTimes)-i);
        }
        scanner.close();
    }
}
