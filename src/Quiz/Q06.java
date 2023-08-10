package Quiz;

public class Q06 {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        // Elemanların toplamını bulmak için bir döngü kullanalım

        int toplam = 0;
        int[] arr= {12, 14 , 21 ,23 , 10 ,4};
        for (int i = 0; i < arr.length; i++)  {
            toplam += arr[i];
        }

            double ortalama = (double) toplam / arr.length;
            System.out.println("Dizinin ortalaması: " + ortalama);
        }
    }




