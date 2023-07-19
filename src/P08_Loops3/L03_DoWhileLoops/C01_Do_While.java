package P08_Loops3.L03_DoWhileLoops;

public class C01_Do_While {
    public static void main(String[] args) {
        // 1 den 10 kadar sayıları ekrana yazdıralım
        int i=1;
        do {
            i++;
            System.out.print(i+" ");

        } while (i<10);

//        System.out.println();
//        for (int j = 1; j <=10 ; j++) {
//            System.out.print(j+" ");
//        }
        System.out.println();
        i=1;
        while (i<=10){
            System.out.print(i+" ");
            i++;
        }
    }
}
