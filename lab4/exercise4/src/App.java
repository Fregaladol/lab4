import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 4- Pides un numero de teléfono y le quitas, si hay, los guiones:   456-453-78 quedaría como 45645378 */

        Scanner scanner = new Scanner(System.in);
        boolean formatNumber = false;
        String phoneNumber;
        
        do {
            System.out.println("Dame tu telefono en el formato: 456-453-781, recuerda seguir el formato.");
            phoneNumber = scanner.nextLine();

            Character separator = phoneNumber.charAt(3);

            if (separator.equals('-')){
                phoneNumber = phoneNumber.replaceAll("-", "\s").replaceAll("\\s","");
                
                System.out.printf("Tu número telefonico sin guiones es; %s.\n", phoneNumber);
                
                formatNumber = true;
            }

        } while (!formatNumber);



        scanner.close();

    }
}
