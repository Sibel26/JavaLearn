package P13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T08 {
    /*  String str = "03/01/2022 şeklinde bir tarih veriliyor
    bunu 05 / Kasım / 2023 şeklinde yazan bir metot yazınız
     */
    public static void main(String[] args) {
        String str ="03/01/2022";
        int ay = Integer.parseInt(str.substring(3,5));
        System.out.print(str.substring(0,2)+" / ");
        switch (ay) {
            case 1: System.out.print("Ocak");break;
            case 2: System.out.print("Şubat");break;
            case 3: System.out.print("Mart");break;
            case 4: System.out.print("Nisan");break;
            case 5: System.out.print("Mayıs");break;
            case 6: System.out.print("Haziran");break;
            case 7: System.out.print("Temmuz");break;
            case 8: System.out.print("Agustos");break;
            case 9: System.out.print("Eylul");break;
            case 10: System.out.print("Ekim");break;
            case 11: System.out.print("Kasım");break;
            case 12: System.out.print("Aralık");break;
        }
        System.out.println(" / "+str.substring(str.length()-4) );


    }

}
