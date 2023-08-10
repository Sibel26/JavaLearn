package P15_Varargs.Tasks;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve
        toplam ile ilk sayıyı çarpan METHOD create ediniz.
        varargs
         */
        //   sayılar :  {2,24, 23, 38, 33, 21, 59, 26, 10};


        int[] numbers = {2, 24, 23, 38, 33, 21, 59, 26, 10};
        int result = toplam(numbers);
        System.out.println("Sonuç: " + result); //sonuc demek result

    }
        public static int toplam(int... numbers) {
            // İlk sayıyı al
            int firstNumber = numbers[0];

            // Diğer sayıları topla
            int sum = 0;
            for (int i = 1; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // Toplamı ilk sayı ile çarp
            int result = firstNumber * sum;

            return result;
        }
    }



    //main sonu



