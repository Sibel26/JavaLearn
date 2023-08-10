package P12_Arrays;

public class C06_MdArrays {
    public static void main(String[] args) {
      /*
		Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
         formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
         matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
         satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir
		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli
		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */
        int[][] array = new int[10][4];
        for (int i = 0; i < array.length ; i++) { // burada array.length = 10 dur
            for (int j = 0; j <array[i].length ; j++) { // bu dizi için array[i].length 4 tür
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }



    }
}
