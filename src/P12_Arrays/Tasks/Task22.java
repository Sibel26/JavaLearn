package P12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("agam bir metin gir : ");//hayat java ile cok kolay
        String arr[] = scan.nextLine().split("");//kulanıcıdan gelen metin "" e göre parçalanarak her bir parca arrayin elemanı olarak atandı
        System.out.println(Arrays.toString(arr));
        String enCokTekrarEden = "";
        int maxSayac = 0;//en cok kullanılan harfin sayısı
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {//karşılaştırılan karakter kontrolu-->h
            for (int j = i + 1; j < arr.length; j++) {//karşılaştıran karakter kontrolu -->a,y,a,t.....
                if (arr[i].equalsIgnoreCase(arr[j])) {//esit karakterlerin kontrolu yapılıp true durumunda sayac artırılarak
                    // esit karakterler saydırlıdı
                    sayac++;
                }
            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];
            }
            sayac = 0;
        }

        System.out.println(" agam metinde encok aha bu harf var : "+enCokTekrarEden);
    }
}

