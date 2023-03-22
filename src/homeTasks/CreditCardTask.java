package homeTasks;
import java.util.Scanner;
public class CreditCardTask {

    public static void main(String[] args) {


        String savedUser="Ladislav";
        int savedPassword=12345678;


             for(int i=0; i<5; i++) {

                 if(i==5){
                     System.out.println("Your credit card blocked");
                     break;
                 }
                 Scanner input=new Scanner(System.in);

                 System.out.println("Please Enter User Name");
                 String username=input.nextLine();

                 System.out.println("Please Enter your password");
                 int password=input.nextInt();


                 if(savedUser.equalsIgnoreCase(username) && savedPassword==password) {
                     System.out.println("Welcome to ATM   "  + savedUser);
                     break;
                 }

                 else {
                     System.out.println("Your UserName or Password is Incorrect please try one more time");
                 }




             }

    }
}
