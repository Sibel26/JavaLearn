package D28;

import java.util.ArrayList;

public class Runner {
/*
       Task 03 ->
       Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
       Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                      derslerin toplam kredi miktarını return eden  toplamKredisi method
       Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                          alamayacagı dersleri print eden code create ediniz
​
        */
    //verable larin sinir kontrollerini yaparken eger ankapsule edilmisse setterlarin icinde yapilir. Ankapsule edilmemisse  constractorlerin icinde yapilabilir...
    // Ödev : bir menü hazirlanacak. kullanicidan ders isimlerini al

    public static void main(String[] args) {

        Lesson fizik = new Lesson("fizik", 6);
        Lesson kimya = new Lesson("kimya",4);
        Lesson matematik = new Lesson("matematik", 4);
        Lesson biyoloji = new Lesson("biyoloji", 3);


        Student std1 = new Student("alice",15, new ArrayList<Lesson>());
        if(std1.toplamKredi()+fizik.credit<=std1.maxCredit){
            std1.list.add(fizik);

        }else {
            System.out.println("yetersiz Kredi");
            System.out.println(fizik.name+ "Dersini alamazsiniz");
            System.out.println(std1.list);
        }
        System.out.println("*******");


        if(std1.toplamKredi()+kimya.credit<=std1.maxCredit){
            std1.list.add(kimya);

        }else {
            System.out.println("yetersiz Kredi");
            System.out.println(kimya.name+ "Dersini alamazsiniz");
            System.out.println();
        }
        System.out.println("*******");

        if(std1.toplamKredi()+matematik.credit<=std1.maxCredit){
            std1.list.add(matematik);

        }else {
            System.out.println("yetersiz Kredi");
            System.out.println(matematik.name+ "Dersini alamazsiniz");
            System.out.println();
        }
        System.out.println("*******");

        if(std1.toplamKredi()+biyoloji.credit<=std1.maxCredit){
            std1.list.add(biyoloji);

        }else {
            System.out.println("yetersiz Kredi");
            System.out.println(biyoloji.name+ "Dersini alamazsiniz");
            System.out.println();
        }
        System.out.println("*******");
    }







}
