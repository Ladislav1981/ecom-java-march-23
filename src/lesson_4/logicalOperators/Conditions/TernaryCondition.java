package lesson_4.logicalOperators.Conditions;

public class TernaryCondition {
    public static void main(String[] args) {

        String result;
        int a = 5, b = 5;
        int c = 6;

        result = (a == b) ? "a and b are equal" : "a and b are not equal";

        System.out.println("result = " + result);

//        if (a == c) {
//            result = "a and c are equal";
//        }
//        else {
//            result = "a and c are not equal";
//        }

        result = (a == c) ? "a and c are equal" : "a and c are not equal";

        System.out.println("result = " + result);

        int age = 20;

        result = (age > 18) ? "You're adult" : (age == 18) ? "You're 18 years old" : "You're a child" ;

        System.out.println("result = " + result);

    }



}
