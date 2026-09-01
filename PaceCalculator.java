import java.util.Scanner;

public class PaceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Race Pace Calculator");
        System.out.println("1. 5K");
        System.out.println("2. 10K");
        System.out.println("3. Half Marathon");
        System.out.println("4. Full Marathon");
        System.out.print("Select distance (1-4): ");
        int choice = scanner.nextInt();

        double miles = 0;
        double km = 0;

        if (choice == 1) {
            miles = 3.1;
            km = 5.0;
        } else if (choice == 2) {
            miles = 6.2;
            km = 10.0;
        } else if (choice == 3) {
            miles = 13.1;
            km = 21.1;
        } else if (choice == 4) {
            miles = 26.2;
            km = 42.2;
        } else {
            System.out.println("Invalid choice, defaulting to 5K.");
            miles = 3.1;
            km = 5.0;
        }

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // mile pace
        double secPerMile = totalSeconds / miles;
        int mileMin = (int) secPerMile / 60;
        int mileSec = (int) secPerMile % 60;

        // km pace
        double secPerKm = totalSeconds / km;
        int kmMin = (int) secPerKm / 60;
        int kmSec = (int) secPerKm % 60;

        // 400m lap pace
        double totalLaps = km * 2.5;
        double secPerLap = totalSeconds / totalLaps;
        int lapMin = (int) secPerLap / 60;
        int lapSec = (int) secPerLap % 60;

        System.out.println();
        System.out.println("Mile Pace: " + mileMin + "m " + mileSec + "s");
        System.out.println("KM Pace: " + kmMin + "m " + kmSec + "s");
        System.out.println("400m Split: " + lapMin + "m " + lapSec + "s");
    }
}


//Used Gemini to explain differences between python and java syntax. 

// Asked Gemini to explain the error "The public type PaceCalculator must be defined in its own file"