package homeTasks;
import java.util.Scanner;
public class CredentialTask {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please Enter Your UserName");
        String userName=input.nextLine();
        System.out.println("Please Enter Your Password");
        String password=input.nextLine();

        String savedUserName ="Ladislav";
        String savedPassword= "1234";
        String result;

        if(userName.equalsIgnoreCase(savedUserName) && password.equalsIgnoreCase(savedPassword)){
            System.out.println("Log-in to System successfully");
        }

        else{
            System.out.println("Log-in to System Failed");
        }

    }
}
