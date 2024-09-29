import java.util.Scanner;

//Class name
public class ClockVersionThree {

    //Method to convert seconds to minutes
    public double secondsToMinutes(double seconds) {
        return seconds / 60; }

    //Method to convert seconds to hours
    public double secondsToHours(double seconds) {
        return seconds / 3600; }

    //Method to convert minutes to seconds
    public double minutesToSeconds(double minutes) {
        return minutes * 60; }

    //Method to convert minutes to hours
    public double minutesToHours(double minutes) {
        return minutes / 60; }

    //Method to convert hours to seconds
    public double hoursToSeconds(double hours) {
        return hours * 3600; }

    //Method to convert hours to minutes
    public double hoursToMinutes(double hours) {
        return hours * 60; }

    public static void main(String[] args) {
        ClockVersionThree clock3 = new ClockVersionThree();
        Scanner scanner = new Scanner(System.in);
        char continueConversion;
        
        //To display the conversion list
        do {
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");
            System.out.print("Choose the Conversion: ");
            int choice = scanner.nextInt();

            System.out.print("Enter the Value: ");
            double value = scanner.nextDouble();
            double result = 0;
            
            //Use case to execute the different choices in the menu
            switch (choice) {
                case 1:
                    result = clock3.secondsToMinutes(value);
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = clock3.secondsToHours(value);
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = clock3.minutesToSeconds(value);
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = clock3.minutesToHours(value);
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = clock3.hoursToSeconds(value);
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = clock3.hoursToMinutes(value);
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to convert time? (Y/N): ");
            continueConversion = scanner.next().charAt(0);
            System.out.print("------------------------------------------\n");
        } while (continueConversion == 'Y' || continueConversion == 'y');
            
        scanner.close();
    }
}
