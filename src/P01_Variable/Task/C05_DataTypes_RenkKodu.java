package P01_Variable.Task;

public class C05_DataTypes_RenkKodu {
    public static void main(String[] args) {

        // Javada renkli kod çıktıları nasıl alabiliriz ?
        //Eğer Java'da terminal veya konsol ekranına farklı renkte yazı yazdırmak / çıktı almak istiyorsanız :nach_rechts_zeigen:
        // Öncelikle bilmeniz gereken ANSI Escape Codes'in  ne olduğudur . ANSI Escape Code aslında işletim sistemi için dizayn edilmiş kodlardır . Bu kodları ASCII alfabesi olarak da farklı bir versiyonda biliyoruz .
        // Bu kodlar sayesinde işletim sistemine belirli ölçüde ne yapması gerektiğini bildiriyoruz . ANSI Escape kodları arasında hangi renkte çıktı vereceğini belirttiğimiz renk kodlaması da bulunmakta. Genelde UNIX shell uzerinde çalışsa da Windows komut isteminde de çalışmaktadır .
        /*      Bu renk kodlarını şöyle listeleyebiliriz */


        // Siyah: \u001B[30m
        // Kırmızı: \u001B[31m
        //  Yeşil: \u001B[32m
        // Sarı: \u001B[33m
        // Mavi: \u001B[34m
        // Magenta: \u001B[35m
        //Cyan: \u001B[36m
        //Beyaz: \u001B[37m
        // Renk reset kodu: \u001B[0m


        // public static final String ANSI_RESET = "\u001B[0m";
        //  public static final String ANSI_SIYAH = "\u001B[30m";
        // public static final String ANSI_KIRMIZI = "\u001B[31m";
        // public static final String ANSI_YEŞİL = "\u001B[32m";
        // public static final String ANSI_SARI = "\u001B[33m";
        // public static final String ANSI_MAVI = "\u001B[34m";
        //public static final String ANSI_MOR = "\u001B[35m";
        //public static final String ANSI_CYAN = "\u001B[36m";
        //public static final String ANSI_BEYAZ = "\u001B[37m";


        String MAVI = "\u001B[34m";
        System.out.println(MAVI + "Mavi gokyuzunde bir renktir ");

        String KIRMIZI = "\u001B[31m";
        System.out.println(KIRMIZI + "Kirmizi oglumun en sevdigi renktir ");

        String YESIL = "\u001B[32m";
        System.out.println(YESIL + "Yeşili kim sevmez ");


    }


}
