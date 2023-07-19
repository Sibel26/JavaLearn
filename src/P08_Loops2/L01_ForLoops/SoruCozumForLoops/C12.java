package P08_Loops2.L01_ForLoops.SoruCozumForLoops;

public class C12 {
    public static void main(String[] args) {
        // bir for cevrimi içerisinde ekrana n kez sıra ile bir true, bir false yazdırın

        int n = 5;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag) {
                System.out.print(flag + " ");
                flag = false;
            } else {
                System.out.print(flag + " ");
                flag = true;
            }
        }
        System.out.println();
        System.out.println("----");

       // cozum 2
        flag=true;
        for (int i = 0; i <n ; i++) {
            System.out.print(flag+" ");
            flag = !flag;
        }


    }
}
