package P10_MethodCreation01.Sorular;

public class S05 {
    // 2 sayıdan büyük olanı bulan bir metot crate ediniz,
    // sayılar main metota okunacak, sonra buyukBul metot a gönderilip ,büuük olan geriye gönderilecek
    public static void main(String[] args) {

        int sayi1 = (int) (Math.random()*100+1);
        int sayi2 = (int) (Math.random()*100+1);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        int eB = buyukBul(sayi1,sayi2);
        System.out.println("buyuk olan : " + eB);
    }

    public static int buyukBul(int sayi1, int sayi2) {

 //       return Math.max(sayi1, sayi2);
        return sayi1>sayi2 ? sayi1:sayi2;
    }


}
