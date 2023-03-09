package lesson_02;

import java.util.Scanner;

public class Scaner_work {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is your name? ");

       String myName= input.nextLine();
        System.out.println("myName = " + myName);
    }
}
