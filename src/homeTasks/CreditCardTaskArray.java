package homeTasks;
import java.util.Scanner;
public class CreditCardTaskArray {
    public static void main(String[] args) {


        String[] usernameArray = {"Ladislav", "userName"};
        int passwordsArray[] = new int[2];

        passwordsArray[0] = 12345678;


        for (int i = 0; i < 5; i++) {

            if (i == 4) {
                System.out.println("Your credit card blocked");
                break;
            }
            Scanner input = new Scanner(System.in);

            System.out.println("Please Enter User Name");
            usernameArray[1] = input.nextLine();

            System.out.println("Please Enter your password");
            passwordsArray[1] = input.nextInt();


            if (usernameArray[0].equalsIgnoreCase(usernameArray[1]) && passwordsArray[0] == passwordsArray[1]) {

                System.out.println("Welcome to ATM   " + usernameArray[0]);
                break;
            } else {
                System.out.println("Your UserName or Password is Incorrect please try one more time");
            }


        }


    }
}