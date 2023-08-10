package D22_RandomClass;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {
       Random rnd = new Random();
       for (int i = 0; i <50;i++) {
           rnd.nextInt(5);
           System.out.print(rnd.nextInt(5)+",");
       }





    }


}
