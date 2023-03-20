package lesson_5.ArrayClassTask.loops.classTask;

public class WhileLoop {
    public static void main(String[] args) {

        String names[] = {"Alex", "Nitzan", "Michal", "Dan", "Bibi"};
        int i = 0;

        while (i < names.length) {
            System.out.println(i + ". " + names[i]);
            i++;
        }

        int j = -2;
        while (j < 20) {
            j++;
            if (j % 5 == 0) {
                continue;
            }
            System.out.println(j);

            if (j == 14) {
                break;
            }

        }

    }
}
