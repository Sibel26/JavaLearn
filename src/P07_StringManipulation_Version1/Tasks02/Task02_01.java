package P07_StringManipulation_Version1.Tasks02;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. karekteri varsa silin// sa olursa if kullaniyoruz

//önce karakter var mi bakilir
        String str = "Harika";

        // Stringin uzunluğunu kontrol ediyoruz
        if (str.length() >= 3) {
            // İlk iki karakteri alıyoruz
            String str1 = str.substring(0, 2);

            // Üçüncü karakterden sonraki kısmı alıyoruz
            String str2 = str.substring(3);

            // İlk iki karakterle kalan kısmı birleştiriyoruz
            String sonuc = str1 +str2;

            System.out.println(sonuc);
        } else {
            System.out.println("Dize 3 karakterden daha kısa!");
        }
    }
}








