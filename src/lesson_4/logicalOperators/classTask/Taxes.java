package lesson_4.logicalOperators.classTask;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your gender? ");
        String gender = scanner.nextLine();
        System.out.println("What is your age? ");
        int age = scanner.nextInt();

        if (age >= 18 && gender.equalsIgnoreCase("women")) {
            System.out.println("You're getting 2.75 points");
        } else if (age >= 18 && gender.equals("men")) {
            System.out.println("You're getting 2.25 points");
        } else {
            System.out.println("Please check your answers...");
        }

    }
}