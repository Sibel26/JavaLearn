package P13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class T06 {
    public static void main(String[] args) {
        // Bir string dizisinde 20 kişilik bir sınıfın doüum günleri (""pazartesi", "salı" ...
        // her bir günde doğan kaç kişi vardır yazdırınız
        ArrayList<String> dogumGunleri = new ArrayList<>(Arrays.asList("Pazartesi", "Cuma",
                "Salı", "Cuma", "Salı", "Salı", "Cuma", "Çarşamba", "Pazartesi", "Cuma", "Pazartesi",
                "Cuma", "Çarşamba", "Cuma", "Salı", "Çarşamba", "Cuma", "Salı", "Cuma"));
        int pazartesi=0,sali=0,carsamba=0,persembe=0,cuma=0,cumartesi=0,pazar=0;
        for (int i = 0; i <dogumGunleri.size() ; i++) {
            switch (dogumGunleri.get(i).toLowerCase()) {
                case "pazartesi": pazartesi++; break;
                case "salı"     : sali++;       break;
                case "çarşamba" : carsamba++;   break;
                case "perşembe" : persembe++;   break;
                case "cuma"     : cuma++;       break;
                case "cumartesi": cumartesi++;  break;
                case "pazar"    : pazar++;      break;
            }
        }
        System.out.println("pazartesi   = " + pazartesi);
        System.out.println("sali        = " + sali);
        System.out.println("carsamba    = " + carsamba);
        System.out.println("persembe    = " + persembe);
        System.out.println("cuma        = " + cuma);
        System.out.println("cumartesi   = " + cumartesi);
        System.out.println("pazar       = " + pazar);


    }
}
