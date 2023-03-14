package homeTasks;

public class comperisonTask {

    public static void main(String[] args) {

        System.out.println("10 > 6->> " +(10>6));
        System.out.println("5 > =5->> " +(5>=5));
        System.out.println("20<10->> " +(20<10));
        System.out.println("35<=50->> " +(35<=50));
        System.out.println("25= =25->> " +(25==25));
        System.out.println("50!=50->> " +(50!=50));

        String str1 = "City";
        String str2= "City";
        String str3 =new String("citY");

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2); //Для своей проверки.

        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("City".equalsIgnoreCase("citY"));
    }
}
