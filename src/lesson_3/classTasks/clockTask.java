package lesson_3.classTasks;
import java.util.Scanner;
public class clockTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What time is it now? ");

        int wholeTime = scanner.nextInt();

        int hours = wholeTime / 100;
        int minutes = wholeTime % 100;

        System.out.println("The current time is: ");
        System.out.println(hours + " : " + minutes);

    }
}
