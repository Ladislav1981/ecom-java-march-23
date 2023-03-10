package homeTasks;
import java.util.Scanner;
public class ScannerHomeTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your First name? ");
        String myFirstName= input.nextLine();
        System.out.println("My First Name = " + myFirstName);

        System.out.println("What is your Last Name?");
        String myLastName= input.nextLine();
        System.out.println("My Last Name =" +myLastName );

        System.out.println("Where do You live?");
        String myCity= input.nextLine();
        System.out.println("I Live in =" +myCity );

        System.out.println("Where do You Study?");
        String myStudy= input.nextLine();
        System.out.println("I Study in =" +myStudy );

        System.out.println("What is your course grade?");
        double myDouble= input.nextDouble();
        System.out.println("My course grade is =" +myDouble );

        System.out.println("What is your age?");
        int myInt= input.nextInt();
        System.out.println("My age is =" +myInt );




    }


}
