package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task14_TernaryCozumu {
    public static void main(String[] args) {

         /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den
          fazla ise emekliliğini,  kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk
          ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
                sadece yaşa bakalım (ay gün dikkate almadan)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kişinin yaşını giriniz      : ");
        int yas= scanner .nextInt();
        System.out.print("Cinsiyetini  giriniz (E/K)  : ");
        String cinsiyet = scanner.next();
        System.out.print("Toplam prim gününüzü giriniz: ");
        int primGunu = scanner.nextInt();
        // cinsiyet.substring(0,1) , cinsiyet stringinin ilk harfini String olarak alır.
        // yani "E" oldu, chatAt(0) ise 'E' oluyordu
        if (cinsiyet.substring(0, 1).equalsIgnoreCase("e")) {
            if (yas >= 65) {
                if (primGunu >= 7000) {
                    System.out.println("emekliliğiniz hayırlı olsun");
                } else {
                    System.out.println("Priminiz " + (7000 - primGunu) + " eksiktir");
                }
            } else if (primGunu >= 7000) {
                // 65 olmamış ama prim dolmuş
                System.out.println("Prim gününüz dolmuş ama emeklilik için " + (65 - yas) + " yıl beklemelisiniz");
            } else {
                // yaş ve prim eksik
                System.out.println("Priminiz " + (7000 - primGunu) + " gün eksik, " +
                        "ayrıca emklilik için " + (65 - yas) + " yıl beklemelisiniz");
            }
        } else {
            if (yas >= 60) {
                if (primGunu >= 6000) {
                    System.out.println("emekliliğiniz hayırlı olsun");
                } else {
                    System.out.println("Priminiz " + (6000 - primGunu) + " eksiktir");
                }
            } else if (primGunu >= 6000) {
                // 65 olmamış ama prim dolmuş
                System.out.println("Prim gününüz dolmuş ama emeklilik için " + (60 - yas) + " yıl beklemelisiniz");
            } else {
                // yaş ve prim eksik
                System.out.println("Priminiz " + (6000 - primGunu) + " gün eksik, " +
                        "ayrıca emklilik için " + (60 - yas) + " yıl beklemelisiniz");
            }
        }
        String cns = cinsiyet.substring(0, 1).toUpperCase();
        // üste cinsiyetin ilk karekterini büyük harfe cevirip altta "E" mi sorduk
        // eğer çevirmeseydim bir altta yorumdaki gibi yapabilidim
        // bu işlemler kullanıcı büyük harf veya küçük harf girdiğin de de çalışmalıdır.
        //String sonuc = cns.equals("E") ||cns.equals("e") ? (yas >= 65 ? (primGunu >= 7000 ?
        String sonuc = cns.equals("E") ? (yas >= 65 ? (primGunu >= 7000 ?
                "emeklisiniz" : "Priminiz " + (7000 - primGunu) + " eksiktir")
                : (primGunu >= 7000 ? "Prim gününüz dolmuş ama emeklilik için " + (65 - yas) + " yıl beklemelisiniz"
                : "Priminiz " + (7000 - primGunu) + " gün eksik, " +
                "ayrıca emklilik için " + (65 - yas) + " yıl beklemelisiniz"))
                : (yas >= 60 ? (primGunu >= 6000 ?
                "emeklisiniz" : "Priminiz " + (6000 - primGunu) + " eksiktir")
                : (primGunu >= 6000 ? "Prim gününüz dolmuş ama emeklilik için " + (60 - yas) + " yıl beklemelisiniz"
                : "Priminiz " + (6000 - primGunu) + " gün eksik, " +
                "ayrıca emklilik için " + (60 - yas) + " yıl beklemelisiniz"));
        System.out.println(sonuc);







}




















    }





