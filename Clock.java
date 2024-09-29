import java.util.Scanner;

public class Clock { //Class name
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        boolean conversion = true;
        
        {
            while (conversion) { //To display the conversion list
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
                
            switch (choice) { //Use case to execute the different choices in the menu
                case 1:
                    result = value / 60; //Method to convert seconds to minutes
                    System.out.println("Seconds to Minutes: " + result );
                    break;
                case 2:
                    result = value / 3600; //Method to convert seconds to hours
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = value * 60; //Method to convert minutes to seconds
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = value / 60; //Method to convert minutes to hours
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = value * 60; //Method to convert hours to seconds
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = value * 60;  //Method to convert hours to minutes
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

