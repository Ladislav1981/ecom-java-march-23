package homeTasks;
import java.util.Scanner;
public class TernaryLogin {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Please Enter Your UserName");
        String userName=input.nextLine();
        System.out.println("Please Enter Your Password");
        String password=input.nextLine();

        String savedUserName ="Ladislav";
        String savedPassword= "1234";
        String result;

        result=(userName.equalsIgnoreCase(savedUserName) && password.equalsIgnoreCase(savedPassword))?("Log-in to System successfully"):("Log-in to System Failed");
        System.out.println(result);


    }
}
