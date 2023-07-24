package P10_MethodCreation01.Sorular;

public class S04 {
    public static void main(String[] args) {
        // bir kişinin not ortalaması ondalıklı olarak veriliyor
        // başarı durumunu bir metotta hesaplayıp print ediniz
        // 85 ve üstü ise takdirname almıştır
        // 75-84 arası teşekkür almıştır
        // 50-74 arası başarılısınız
        // 50 altı başarısız
        int not = (int) (Math.random()*100+1);
        String sonuc = basariDurumu(not);

        System.out.println("Basarı durumu = "+ sonuc);
    }

    public static String basariDurumu(double notOrtalamasi) {
        if (notOrtalamasi >= 85) {
            return "Takdirname almıştır";
        } else if (notOrtalamasi >= 75) {
            return "Teşekkür almıştır";
        } else if (notOrtalamasi >= 50) {
            return "Başarılısınız";
        } else {
            return "Başarısız";
        }
    }

    public static String basariDurumu2(double notOrtalamasi) {
        String sonuc;
        if (notOrtalamasi >= 85) {
            sonuc= "Takdirname almıştır";
        } else if (notOrtalamasi >= 75) {
            sonuc=  "Teşekkür almıştır";
        } else if (notOrtalamasi >= 50) {
            sonuc=  "Başarılısınız";
        } else {
            sonuc=  "Başarısız";
        }
        return sonuc;
    }
}
