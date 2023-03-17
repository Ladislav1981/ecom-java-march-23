package homeTasks;
import java.util.Scanner;
public class Ternary_Login {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        System.out.println("Please Enter Your UserName");
        String UserName=input.nextLine();
        System.out.println("Please Enter Your Password");
        int Password=input.nextInt();

        String SavedUserName ="Ladislav";
        int SavedPassword= 1234;
        String Result;

        Result=(UserName.equalsIgnoreCase(SavedUserName) && Password==SavedPassword)?("Log-in to System successfully"):("Log-in to System Failed");
        System.out.println(Result);


    }
}
