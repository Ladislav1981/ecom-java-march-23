package lesson_5.ArrayClassTask.loops.classTask;

public class ForLoopTask {

    public static void main(String[] args) {


       int summery= 0;
        for(int i =1000; i>=0; i-- ){

          if(i%5==0){
            System.out.println(i);
              summery+=i;
          }
        }
    }
}
