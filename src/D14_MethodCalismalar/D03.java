package D14_MethodCalismalar;

public class D03 {
    public static void main(String[] args) {

        // bir kişinin not ortalaması ondalıklı olarak veriliyor
// başarı durumunu bir metotta hesaplayıp print ediniz
// 85 ve üstü ise takdirname almıştır
// 75-84 arası teşekkür almıştır
// 50-74 arası başarılısınız
// 50 altı başarısız



//        Scanner scan = new Scanner(System.in);
//        System.out.print("Not ortalamasını giriniz: ");
//        double ort = scan.nextInt();


        ortalama();


    }
    public static void ortalama () {
        double not = Math.round((Math.random()*100));
        System.out.print("Üretilen not ==> " + not);
        System.out.println();


        if (not >=85 ) System.out.println("Takdırname almıştır.");
        else if (not >= 75) System.out.println("Teşekkür almıştır.");
        else if (not >= 50) System.out.println("Başarılıdır.");
        else System.out.println("Başarısızdır.");
    }




    }
/*public static void main(String[] args) {        //(diger yol)
        //    double notOrtalamasi = 80.5;                  //manuel  not ortalaması
        Random random = new Random();
        double notOrtalamasi = random.nextDouble() * 100; // bilgisayarin sectigi rastgele not ortalaması
        System.out.println(notOrtalamasi);
​
​
        String basariDurumu = basariDurumu(notOrtalamasi);  // basari durumu cagir?
        System.out.println( basariDurumu);
    }
​
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
​
​
    }
}
*/













