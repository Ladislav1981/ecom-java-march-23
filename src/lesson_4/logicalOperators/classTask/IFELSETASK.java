package lesson_4.logicalOperators.classTask;
import java.util.Scanner;
public class IFELSETASK {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);



        System.out.println("Enter number");
        int Num= input.nextInt();

        if(Num%2==0){
            System.out.println("Print Even");
        }

        else{System.out.println("Print odd");

        }
    }






}
