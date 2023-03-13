package lesson_3;

public class String_compares {

    public static void main(String[] args) {


        String UserName="Alexandr";
        String ActualUserName= "Alexandr";
        System.out.println("UserName == ActualUserName -> " +  (UserName==ActualUserName) );


        String ExpectedName = new String("Alexandr");
        System.out.println("ActualUserName == ExpectedName -> " + (ExpectedName== ActualUserName));


        System.out.println();



    }
}
