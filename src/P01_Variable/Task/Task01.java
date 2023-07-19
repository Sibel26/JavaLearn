package P01_Variable.Task;

public class Task01 {
    	/* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */


    public static void main(String[] args) {
        //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız

        System.out.println("\"Hello \",\"World \\ /\"");



        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.

        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");


        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız

        System.out.println("\"Java\" ile hayat cok 'afilli'");


        //Soru-4 : "Basari" gayrete
        // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        System.out.println("\"Basari\" gayrete 'asiktir' \n\n\n\t\"Clarusway ile java cok kolay...\"");








// Tasks : Her bir primitive data type dan birer variable oluşturun ve bunu ekrana yazdırın

        int sayi = 10;
        System.out.println(sayi);

        double kesirli =  44.10;
        System.out.println(kesirli);

        char ch = 'K';
                System.out.println(ch);

        boolean right = true;
        System.out.println( false);

        String str = "System Engineer";
        System.out.println(str);

        float ondalik = 35.98f;
        System.out.println(ondalik);

        byte bilgisayar = 127;
        System.out.println(bilgisayar);

        short ekran = 32000;
        System.out.println(ekran);

        long mause = 678899000000L;
        System.out.println(mause);












    }
}