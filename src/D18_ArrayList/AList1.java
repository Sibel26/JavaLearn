package D18_ArrayList;

import java.util.ArrayList;

public class AList1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<Integer> dizi = new ArrayList<>();//1
        //
       // ArrayList<Integer>dizi2 = new ArrayList<>(Arrays.asList(5,4,2,6));
        // dizide ekleme
        int sayi=5;
        dizi.add(sayi);
        dizi.add(sayi+4);
        dizi.add(sayi-2);
        System.out.println(dizi);//5,9,3

        //dizinin bir elemani degistirme,dizi[2] =12;
        dizi.set(2,12);//5,9,12

        //System.out.println(dizi.get(1));
        System.out.println(dizi.get(1));

        //yarim kaldi yaz tel de var

int sum =dizi.get(1)+dizi.get(2);
dizi.set(0,sum); // 21, 9,12
        System.out.println(dizi);





    }

}
