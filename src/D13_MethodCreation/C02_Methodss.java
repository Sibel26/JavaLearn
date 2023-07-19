package D13_MethodCreation;

import java.util.Scanner;

public class C02_Methodss {

    //task-girilen 3 sayinin ortalamasini print eden METHOD create ediniz

    public static void main(String[] args) {
        int n1 = 22;
        int n2 = 17;
        int n3 = 45;
        double avg = (n1+n2+n3) / 3.0;
        System.out.println(avg);


    }
    public  static void ortalama() {      //halime h
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();
        double ortalama= (sayi1+sayi2+sayi3)/3.0;
        System.out.println(ortalama);

    } }





