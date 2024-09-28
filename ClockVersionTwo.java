import java.util.Scanner;

public class ClockVersionTwo {
  
  public double SecondstoMinutes(double seconds){ //Method to convert seconds to minutes
    return seconds / 60.0;
  }
  public double SecondstoHours(double seconds){ //Method to convert seconds to hours
    return seconds * 3600;
  }
  public double MinutestoSeconds(double minutes){  //Method to convert minutes to seconds
    return minutes * 60;
  }
  public double MinutestoHours(double minutes){
    return minutes / 60;
  }
  public double HourstoSeconds(double hours){
    return hours * 3600;
  }
  public double HourstoMinutes(double hours){
    return hours * 60;
  }


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ClockVersionTwo clock2 = new ClockVersionTwo();
    boolean conversion = true;
  
    while (conversion) {
        System.out.println("[1] Seconds to Minutes");
        System.out.println("[2] Seconds to Hours");
        System.out.println("[3] Minutes to Seconds");
        System.out.println("[4] Minutes to Hours");
        System.out.println("[5] Hours to Seconds");
        System.out.println("[6] Hours to Minutes");
        System.out.print("Choose the conversion: ");
          int choiceNum = input.nextInt();
        System.out.print("Enter the value: ");
          int value = input.nextInt();
          double result = 0;
  
      switch (choiceNum) {
        case 1:
          result = clock2.SecondstoMinutes(value);
          System.out.println("Seconds to Minutes: " + result);
          break;
        case 2:
          result = clock2.SecondstoHours(value);
          System.out.println("Seconds to Hours: " + result);
          break;
        case 3:
          result = clock2.MinutestoSeconds(value);
          System.out.println("Minutes to Seconds: " + result);
          break;
        case 4:
          result = clock2.MinutestoHours(value);
          System.out.println("Minutes to Hours: " + result);
          break;
        case 5:
          result = clock2.HourstoSeconds(value);
          System.out.println("Hours to Seconds: " + result);
          break;
        case 6:
          result = clock2.HourstoMinutes(value);
          System.out.println("Hours to Minutes: " + result);
          break;
        default:
          System.out.println("Invalid choice.");
  
      }
      System.out.print("Do you want to continue? (Y/N): ");
      char choice = input.next().charAt(0);
      System.out.print("------------------------------------------\n");
      conversion = (choice == 'Y' || choice == 'y');
    }
  
    input.close();
  }
}