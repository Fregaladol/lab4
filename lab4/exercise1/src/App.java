import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* 1- El usuario tiene que acertar un número del 1 al 5, generado aleatoriamente. Le vas preguntando hasta que acierte. */

        Scanner scanner = new Scanner(System.in);
        boolean winner = false;
        int counter = 0;

        do {

            System.out.println("Dime un numero del 1 al 5, si aciertas ganas.");
            int userAnswer = scanner.nextInt();

            Random random = new Random();

            int randomNumber = random.nextInt(1, 5);

            System.out.printf("Has escogido el número %d, y ha salido el %d.\n", userAnswer,randomNumber);

            if (randomNumber == userAnswer) {
                System.out.println("FELICIDADES HAS GANADO!");
                winner = true;
            } else {
                System.out.println("Suerte para la próxima!");
            }
            counter +=1;

        } while (!winner);

        System.out.printf("Has acertado en tu intento %d", counter);
        scanner.close();

    }
}
