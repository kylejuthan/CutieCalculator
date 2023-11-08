import java.util.*;

public class CutieCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Cutie Calculator 😍");
        System.out.println();

        System.out.print("Please Enter Your Name: ");
        String userName = sc.nextLine();
        System.out.println();

        System.out.print("Thank you " + userName);
        System.out.println();

        System.out.print("Calculating ");

        for (int i = 0; i < 8; i++) {
            System.out.print(".");
            try {
                Thread.sleep(500); // Sleep 100ms (0.1  seconds)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

           /* if ((userName == "Buchita") || (userName == "buchita") || (userName == "Buch") || (userName == "buch") || (userName == "Goob") || (userName == "goob")) {
                System.out.println("Cutie");

                System.out.println();
                System.out.println("Have you been rizzed up by the Rizzler Kyle? (Enter Yes or No)");
                String rizzStatus= sc.nextLine();

                if ((rizzStatus == "Yes") || (rizzStatus == "yes") || (rizzStatus == "Y") || (rizzStatus == "y")) {
                    System.out.println("You're damn right, you've been rizzed up goob whether you like it or not.");
                }
                else {
                    // loop here asking same question
                    System.out.println("Stop lying!");
                }
            } else {
                // block of code to be executed if the condition is false
            }*/

        if (userName.equalsIgnoreCase("Buchita") || userName.equalsIgnoreCase("Buch") || userName.equalsIgnoreCase("Goob")) {
            //System.out.println("Cutie");
            System.out.println(" _____________________________\n" +
                    "|  _________________________  |\n" +
                    "| |You are a certified cutie| |\n" +
                    "| |_________________________| |\n" +
                    "|      ___ ___ ___   ___      |\n" +
                    "|     | 7 | 8 | 9 | | + |     |\n" +
                    "|     |___|___|___| |___|     |\n" +
                    "|     | 4 | 5 | 6 | | - |     |\n" +
                    "|     |___|___|___| |___|     |\n" +
                    "|     | 1 | 2 | 3 | | x |     |\n" +
                    "|     |___|___|___| |___|     |\n" +
                    "|     | . | 0 | = | | / |     |\n" +
                    "|     |___|___|___| |___|     |\n" +
                    "|_____________________________|");

            /*String message = "You are a certified cutie";

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                System.out.print(ch);
                Thread.sleep(100); // Sleep 100ms (0.1 seconds)
            }*/

            System.out.println();
            System.out.println("Have you been rizzed up by the Rizzler Kyle? (Enter Yes or No)");
            String rizzStatus = sc.nextLine();

            if (rizzStatus.equalsIgnoreCase("Yes") || rizzStatus.equalsIgnoreCase("Y")) {
                System.out.println("You're damn right, you've been rizzed up goob whether you like it or not.");

            } else {


            }

        }
    }
}