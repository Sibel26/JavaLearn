package P07_StringManipulation_Version1;

public class C01_StringManipulation {
    public static void main(String[] args) {
        // charAt(): Belirtilen indeksteki (konum) karakteri verir. char döndürür
        String myStr = "Hello";
        String myStr2 = " Mehmet";
        char result1 = myStr.charAt(0);
        System.out.println(result1);

        // indexOf(): Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir.
        // int döndürür.
        int yer = myStr.indexOf("llo"); // 2
        int yer2 = myStr.indexOf('o'); // 4

        System.out.println("gonderilen karekterin yeri = "+yer);
        System.out.println(myStr.length());
        String str= "Faruk kadılar"; // başluk kaçıncı karekterdir
        System.out.println(str.indexOf(' '));

        // str stringinde boşluktan sonra kaç karekter vardır?
        System.out.println(str.length()-1-str.indexOf(' '));

        // verilen stringin ortadaki karekterini print ediniz.
        // string 5 karekter ise (01234)ortanca karekter 2       uzunluk  / 2
        // string 6 karekter ise (012345) ortanca 2 veya 3 tür   uzunluk  / 2
        int ortanca = str.length()/2;
        System.out.println(str.charAt(ortanca));

        System.out.println(str.charAt(str.length()/2));

//        str.toLowerCase();
//        str.toUpperCase();




    }
}
