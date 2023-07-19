package D12_BreakContinuee;

public class C01_Break {

    public static void main(String[] args) {

        //rast gele 1 ile 100 arasinda 20 adet sayi üretilmektedir
        //10 a bölünemeyenleri print ediniz
        for (int i=0; i<20; i++) {
            int number = (int)   (Math.random()*100+1) ;// bölünemeyenleri yazacak
            if (number %2 == 0) {
               continue;
            }
            System.out.println(number+" ");                    // yanlislik var mi,kontrol et????
        }





    }

}
