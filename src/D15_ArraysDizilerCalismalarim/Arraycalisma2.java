package D15_ArraysDizilerCalismalarim;

public class Arraycalisma2 {
    public static void main(String[] args) {
// Bir tane String array olusturalım ve son elemanını yazdıralım

        int []  sayiList1={1,2,3,4,5,6,7,8};
        System.out.println("son eleman = " + sayiList1[sayiList1.length-1]);

// String [] a = {"ab","ac", "ad"};

        // int [] a = {23,23,23,23,23} toplamini bulunuz
        int [] a = {23,23,23,23,23};//5 elemanli
        int toplam = 0;
        for (int i=0; i<a.length; i++) {
            toplam = toplam +a[i];
        }
        System.out.println("toplam = " + toplam);


    }



}
