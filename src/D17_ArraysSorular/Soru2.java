package D17_ArraysSorular;

public class Soru2 {
    public static void main(String[] args) {
/*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.

*/

        //Kodu asagiya yaziniz
        int toplam = 0;
        int [][] dizi =  {{5,2,1} , {10,2,3,6} , {1,2}};
        for (int i = 0; i < dizi[i].length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                toplam += dizi[i][j];
                System.out.println(dizi[i][j] + " ");

            }

            System.out.println();

//sonuc dogru mu
        }

        System.out.println("toplam = " + toplam);

    }
}
