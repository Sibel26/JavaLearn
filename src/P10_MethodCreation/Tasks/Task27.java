package P10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task27 {
    /*
   task->
   belirli bir yukseklikten bırakılan top atildigi yuksekligin 3/4 u kadar
   yerden yukari dogru   ziplamaktadir Topun ziplama  yuksekligi 1 metrenin
   altina dşütüğü ana kadar topun aldigi toplam yolu ve yere vurma sayisini print eden
   METHOD  create ediniz.
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("yukseklik girin: ");
        double h = input.nextDouble(); // 20 olarak girelim
        hesapla(h);
        System.out.println("main h = " + h);
    }

    private static void hesapla(double h) {
        int toplamYol=0;
        int vurmaSayisi=0;
        do {
            vurmaSayisi++;
            toplamYol +=h;
            h=h*0.75;
            toplamYol +=h;
        } while (h>=1);

        System.out.println("vurmaSayisi = " + vurmaSayisi);
        System.out.println("toplamYol = " + toplamYol);
        System.out.println("hesapla h = " + h);
    }


}
