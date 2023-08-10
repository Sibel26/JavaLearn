package P19_StringBulder;

import java.util.ArrayList;

public class C01_StringBulder {
    public static void main(String[] args) {
      /*  String = > daha yavas ,Immutable==> degismez,
                String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

        1) Java pass-by-value kullanir.dublor
        2) String Class'i immutable Class'dir.değişmez

                StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
                StringBuffer synchronized,thread safe.

        StringBuilders = mutable==>degisebilir ,
                not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

        1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
        StringBuilder isimli bir class uretmistir.
        2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
        "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
        "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
        Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
     */

        StringBuilder sbd = new StringBuilder();
        sbd.append(20);
        sbd.append(" sayı budur").append(" değil mi").append("?");// append eklemek demek

        System.out.println(sbd);
        metotSB(sbd);
        System.out.println(sbd);
    }

    private static void metotSB(StringBuilder sbd) {
        sbd.append(100);
    }



}
