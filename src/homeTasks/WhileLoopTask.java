package homeTasks;

public class WhileLoopTask {
    public static void main(String[] args) {


        int j = 0;
        int sum = 0;

        while (j <= 500) {


            if(j==100){
                break;
            }


            if(j%7==0){
                System.out.print(j + " ");
                j++;
                sum=j+sum;
                continue;
            }

            if(j%4==0){
                j++;
                continue;
            }



            j++;

        }
        System.out.println(sum);
    }

}