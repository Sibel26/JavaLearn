package Quiz;

public class Q02 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int[] arr = { 5, 6, 8, 12, 14, 19 };

        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2!=0){
                sonuc=sonuc-arr[i];
                //sonuc-=arr[i];
        }else if (arr[i]%2==0){
                sonuc += arr[i];
            }


        }
        System.out.println(sonuc);





    }
}
