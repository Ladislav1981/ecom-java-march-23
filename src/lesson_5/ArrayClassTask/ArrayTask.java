package lesson_5.ArrayClassTask;

import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {
        double summary = 0;
        Scanner scanner = new Scanner(System.in);

        int numbersArray[] = new int[3];
        System.out.println("Please enter number 1: ");
        numbersArray[0] = scanner.nextInt();
        summary += numbersArray[0];

        System.out.println("Please enter number 2: ");
        numbersArray[1] = scanner.nextInt();
        summary += numbersArray[1];

        System.out.println("Please enter number 3: ");
        numbersArray[2] = scanner.nextInt();
        summary += numbersArray[2];

        int biggestNumber = (numbersArray[0] > numbersArray[1]) ? numbersArray[0] : numbersArray[1];
        int smallest = (numbersArray[0] < numbersArray[1]) ? numbersArray[0] : numbersArray[1];
        biggestNumber = (numbersArray[2] > biggestNumber) ? numbersArray[2] : biggestNumber;
        smallest = (numbersArray[2] < smallest) ? numbersArray[2] : smallest;

        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("smallest = " + smallest);
        System.out.println("(summary / 3.0) = " + (summary / 3.0));
    }
}
