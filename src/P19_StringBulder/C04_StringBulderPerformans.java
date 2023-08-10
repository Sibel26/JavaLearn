package P19_StringBulder;

import java.util.ArrayList;

public class C04_StringBulderPerformans {
    public static void main(String[] args) {
      //  speedTestMethot();
        speedTestMethot2();
    }

    private static void speedTestMethot2() {
        StringBuilder sb = new StringBuilder();
        String st="";
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            sb.append(i);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        for (int i = 0; i <100000 ; i++) {
            st=st+i;
        }
        long t3 = System.currentTimeMillis();
        System.out.println(t3-t2);
    }

    private static void speedTestMethot() {
        ArrayList<StringBuilder> sbArr = new ArrayList<>();
        ArrayList<String> strArr=new ArrayList<>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            StringBuilder s = new StringBuilder();
            s.append(i);
            sbArr.add(s);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        for (int i = 0; i <1000000 ; i++) {
            String s = ""+i;
            strArr.add(s);
        }
        long t3 = System.currentTimeMillis();
        System.out.println(t3-t2);
    }
}
