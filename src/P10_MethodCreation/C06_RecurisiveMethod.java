package P10_MethodCreation;

import java.util.Scanner;

public class C06_RecurisiveMethod {
    public static void main(String[] args) {
            /*
Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek konumu oluşur.
Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
Peki özyinelemeyi neden kullanıyoruz?
Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
 */

   /*
        Faktoriyel girilen sayıdan 1 e kadar olan tamsayıların çarpımına denir
        1!=1 0!=1 2!=2*1... 6!=6*5*4*3*2*1
        Task : girilen sayının faktöriyelini hesaplayan method create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("bizim oolan bi sayi girive gari : ");
        int sayi1 = input.nextInt();

        System.out.println("faktoriyel(sayi1) = " + faktoriyel(sayi1));

    }//main sonu

    private static int faktoriyel(int sayi) {

        if (sayi>= 1) {

            return sayi*faktoriyel(sayi-1);
        }else return 1;
    }


}
