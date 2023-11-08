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
        if (userName.equalsIgnoreCase("Buchita") || userName.equalsIgnoreCase("Buch") || userName.equalsIgnoreCase("Goob")) {
            //System.out.println("Cutie");
            String cuteResult = " _____________________________\n" +
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
                "|_____________________________|\n";
        char[] charArr = cuteResult.toCharArray();

        for(int i=0; i<=charArr.length-1;i++)
        {

            System.out.print(charArr[i]);
            try
            {
                Thread.sleep(1);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
            /*System.out.println(" _____________________________\n" +
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
                    "|_____________________________|");*/

            while (userName.equalsIgnoreCase("Buchita") || userName.equalsIgnoreCase("Buch") || userName.equalsIgnoreCase("Goob")) {
                System.out.println();
                System.out.println("Have you been rizzed up by the Rizzler Kyle? (Enter Yes or No)");
                String rizzStatus = sc.nextLine();

                if (rizzStatus.equalsIgnoreCase("Yes") || rizzStatus.equalsIgnoreCase("Y")) {
                    System.out.println();
                    System.out.println("Good answer. You've been rizzed up goob whether you like it or not 😘");
                    break;
                } else {
                    System.out.println();
                    System.out.println("Stop lying!🙄");
                }
            }
        } else {
            String notCuteResult = " _____________________________\n" +
                    "|  _________________________  |\n" +
                    "| | You are not a cutie. :( | |\n" +
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
                    "|_____________________________|\n";
            char[] charArr = notCuteResult.toCharArray();

            for(int i=0; i<=charArr.length-1;i++)
            {

                System.out.print(charArr[i]);
                try
                {
                    Thread.sleep(1);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
            /*System.out.println(" _____________________________\n" +
                    "|  _________________________  |\n" +
                    "| | You are not a cutie. :( | |\n" +
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
        }*/
    }
}

