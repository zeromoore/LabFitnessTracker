import java.util.Scanner;

class Workout {
    String type;
    int duration;

    void showWorkout() {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class RunningWorkout extends Workout {
    double distance;

    void showDetails() {
        System.out.println("--- Workout Summary ---");
        showWorkout();
        System.out.println("Distance: "  + distance + " km");
        double caloriesBurned = distance * 60;
        System.out.println("Calories burned: " + caloriesBurned);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter workout type: ");
        String type = input.nextLine();

        System.out.print("Enter duration (minutes): ");
        int duration = input.nextInt();

        System.out.print("Enter distance (km): ");
        double distance = input.nextDouble();

        RunningWorkout workout1 = new RunningWorkout();
        workout1.type = type;
        workout1.duration = duration;
        workout1.distance = distance;
        workout1.showDetails();

        }
    }

//ran code it, it ran with no errors. Yasel Rodriguez
