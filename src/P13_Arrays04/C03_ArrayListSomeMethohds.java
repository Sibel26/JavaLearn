package P13_Arrays04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03_ArrayListSomeMethohds {
    public static void main(String[] args) {
        // Arraylist Methodları
        //  (List.of
        // Collections.nCopies
        // addAll
        // indexOf / lastIndexOf
        // isEmpty()-> listin boş olmasını kontrol eder true/false return eder
        // clear()-> listin tum elemanlarını silip boşaltır
        // equals
        // contains()-> list'te istenen elamnın varlığını control eder true/false return eder
        // replaceall();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder


        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Anya", "Cihat", "Poya", "Dtere", "Amera"));//çuval
        ArrayList<String> isimList = new ArrayList<>(List.of("Aydın", "Cihat", "Ismail", "Ceren", "Furkan", "Tugba"));

        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(7, "jv"));//-> 7 javaTAR elemanlı lst tanımlandı
        System.out.println(yeniList);

        yeniList.addAll(ulkelist); // ulkelist i yeni listin sonuna ekliyor
        System.out.println(yeniList);
        yeniList.addAll(2,isimList);
        System.out.println(yeniList);
        String eleman="Cihat";
        System.out.println(eleman+",  " +yeniList.indexOf(eleman)+". indextedir");
        System.out.println(eleman+",  " +yeniList.lastIndexOf(eleman)+". indextedir");
        System.out.println( yeniList.subList(5,10));
        yeniList.clear();
        System.out.println("yeni liste = "+yeniList);
        System.out.println("isEmty() = "+yeniList.isEmpty());

        // isEmpty() yerine aynısını ternary ile yapalım
        System.out.println("ternary = "+(yeniList.size()==0 ? "true":"false"));

        // List inteface dir, ArrayList clas tır, interface referenas verilemez
        List<String> yListe = new ArrayList<>();
        yeniList.addAll(ulkelist);
        yeniList.addAll(isimList);
        yListe = yeniList.subList(5,10);
        System.out.println("---   List.subList --- ");
        System.out.println(yeniList);
        System.out.println(yListe);
        // equals
        yeniList.clear();
        yeniList.addAll(ulkelist);
        System.out.println("\n"+" ---  equals ----");
        System.out.println(yeniList);
        System.out.println(ulkelist);
        boolean sonuc = yeniList.equals(ulkelist);
        System.out.println(sonuc);

        // containsAll
        System.out.println("\n"+" --- containsAll ---");
       // yeniList.remove(0); // bu işlemi yaparak eşit olmasını engelledim
        System.out.println(yeniList.containsAll(ulkelist));


        // replaceAll
        System.out.println("\n ----   replaceAll  ----");
        yeniList.addAll(ulkelist);
        System.out.println(yeniList);

        // yeniList.replaceAll("Poya","Polanya"); değişiklik varsa true yoksa false donderiyor
        boolean rSonuc  = Collections.replaceAll(yeniList,"Poya","Polanya");
        System.out.println(yeniList);





    }
}
