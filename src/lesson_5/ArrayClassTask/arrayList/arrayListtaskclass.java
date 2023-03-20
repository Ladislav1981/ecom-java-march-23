package lesson_5.ArrayClassTask.arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayListtaskclass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int numberArray[] = new int[3];
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Please enter the first number");
//        numberArray[0] = scanner.nextInt();
        arrayList.add(scanner.nextInt());
        System.out.println("Please enter the second number");
        arrayList.add(scanner.nextInt());
        System.out.println("Please enter the third number");
        arrayList.add(scanner.nextInt());

        int biggestNumber = (arrayList.get(0) > arrayList.get(1) ) ? arrayList.get(0) : arrayList.get(1);

        biggestNumber = (biggestNumber > arrayList.get(2)) ? biggestNumber : arrayList.get(2);

        System.out.println("Biggest Number = " + biggestNumber);



    }
}
