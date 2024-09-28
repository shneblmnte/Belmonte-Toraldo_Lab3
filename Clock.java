import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // To be able to do inputting and scanned the input numbers.
        double result = 0;
        boolean conversion = true;
        
        {
            while (conversion) {
                System.out.println("[1] Seconds to Minutes");
                System.out.println("[2] Seconds to Hours");
                System.out.println("[3] Minutes to Seconds");
                System.out.println("[4] Minutes to Hours");
                System.out.println("[5] Hours to Seconds");
                System.out.println("[6] Hours to Minutes");
                System.out.print("Choose the conversion: ");
                  int choice = input.nextInt();
                System.out.print("Enter the value: ");
                  int value = input.nextInt();
                
            switch (choice) {
                case 1:
                    result = value / 60;
                    System.out.println("Seconds to Minutes: " + result );
                    break;
                case 2:
                    result = value / 3600;
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = value * 60;
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = value / 60;
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = value * 60;
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = value * 60;
                    System.out.println("Hours to Minutes: " + result);
                    break;
             } 

            
                System.out.print("Do you want to continue? (Y/N): ");
     
                char choice2 = input.next().charAt(0);
                System.out.print("------------------------------------------\n");
                conversion = (choice2 == 'Y' || choice2 == 'y');

            } input.close();
        } 

    }
}

