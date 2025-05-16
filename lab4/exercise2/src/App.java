import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 2- Tienes un color preseleccionado, por ejemplo el rojo, y le preguntas al usuario un color a ver si lo acierta (hasta tres intentos) */

        String favoriteColor = "red";

        Scanner scanner = new Scanner(System.in);       
        

        for (int i=0; i < 3; i++){
            
            System.out.println("adivina mi color favorito, juguemos!!");
            String colorGuessed = scanner.nextLine();
            
            if (colorGuessed.equalsIgnoreCase(favoriteColor)){
                System.out.println("GUAAAUUU has acertado");
                break;
                //System.exit(0); 
                
            } else {
                System.out.println("Para nada vuelve a intentarlo");
            }

             if (i == 2){

            System.out.println("Se te acabaron las oportunidades");
            }



        }

       

        scanner.close();
    }
}
