package homeTasks;
import java.util.Scanner;
public class LoginTo {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Your UserName");
        String UserName=input.nextLine();
        System.out.println("Please Enter Your Password");
        int Password=input.nextInt();

        String SavedUserName ="Ladislav";
        int SavedPassword= 1234;

        if(UserName.equalsIgnoreCase(SavedUserName) && Password==SavedPassword){
            System.out.println("Log-in to System successfully");
        }

        else{
            System.out.println("Log-in to System Failed");
        }

    }
}
