package lesson_4.logicalOperators.classTask;
import java.util.Scanner;
public class TernaryTask {

    public static void main(String[] args) {

        double summary = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int firstNumber = scanner.nextInt();
        summary += firstNumber;
        System.out.println("Please enter number 2: ");
        int secondNumber = scanner.nextInt();
        summary += secondNumber;
        System.out.println("Please enter number 3: ");
        int thirdNumber = scanner.nextInt();
        summary += thirdNumber;

        int biggestNumber = (firstNumber > secondNumber) ? firstNumber : secondNumber;
        int smallest = (firstNumber < secondNumber) ? firstNumber : secondNumber;
        biggestNumber = (thirdNumber > biggestNumber) ? thirdNumber : biggestNumber;
        smallest = (thirdNumber < smallest) ? thirdNumber : smallest;

        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("smallest = " + smallest);
        System.out.println("(summary / 3.0) = " + (summary / 3.0));

    }
}
