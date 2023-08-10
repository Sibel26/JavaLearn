package Quiz;

public class Q03 {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};

        // Aranan eleman
        String targetFruit = "Apple";

        // Elemanın dizi içinde olup olmadığını kontrol etmek için bir döngü kullanalım
        boolean found = false;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("Apple")){
                found = true;
                break;
            }
        }

        // Sonuçları yazdır
        System.out.println(found);
    }
}











