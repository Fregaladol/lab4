import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 5- Se pide un texto. Decir si está compuesto solo de minúsculas, solo de mayúsculas o si combina mayúsculas y minúsculas. */

        Scanner scanner = new Scanner(System.in);

        int lowerCaseWord = 0;
        int upperCaseWord = 0;
        

        System.out.println("Dame un texto");
        String text = scanner.nextLine();

        

        for (int i = 0 ; i < text.length(); i++){
                
                char charWord = text.charAt(i);
                
                if (Character.isLowerCase(charWord)){
                    lowerCaseWord += 1;
                } else if (Character.isUpperCase(charWord)){
                    upperCaseWord +=1;
                } else {
                    continue; //special characters like (!,-), numbers or whitespaces
                }
            }
       

        if (upperCaseWord >0 && lowerCaseWord > 0) {
            System.out.println("El texto combina mayúsculas y minúsculas.");
        } else if (upperCaseWord == 0 && lowerCaseWord > 0){
            System.out.println("El texto solo tiene minúsculas.");
        } else if (upperCaseWord > 0 && lowerCaseWord == 0){
            System.out.println("El texto es solo mayúsculas.");
        } else {
            System.out.println("Tu texto no tiene coherencia. Solo usa caracteres especiales");
        }

        scanner.close();


    }
}
