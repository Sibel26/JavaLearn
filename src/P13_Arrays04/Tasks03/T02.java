package P13_Arrays04.Tasks03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T02 {
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz
         */
        ArrayList<String> hava = new ArrayList<> (Arrays.asList("kar" ,"yagmur" , "dolu", "sis" ,"bulut"));

        //1.yol;
        int index1 = 0;
        int index2 = 4;
        Collections.swap(hava,index1,index2);
        System.out.println(hava);


        //2.yol;
       //hüseyin b yöntemleri

        ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(44, 28, 18, 36, 65, 97, 84, 16, 39, 8));

        System.out.println("Ilk liste => "+liste);

        System.out.println("***** YONTEM BIR *****");

        ArrayList<Integer> ll = yontemBir(liste);
        System.out.println("Yeni liste => "+ll);

        System.out.println("***** YONTEM IKI *****");

        ArrayList<Integer> ll2 = yontemIki(liste);
        System.out.println("Güncel Liste ==> " + ll2);

        System.out.println("***** YONTEM ÜC *****");

        ArrayList<Integer> ll3 = yontemUc(liste);
        System.out.println("Güncel Liste ==> " + ll3);


    }
    private static ArrayList<Integer> yontemBir (ArrayList<Integer> liste) {

        int index1 = 5;
        int index2 = 8;
        int num1 = liste.get(5);
        int num2 = liste.get(8);
        liste.set(index1,num2);
        liste.set(index2,num1);

        return liste;
    }
    private static ArrayList<Integer> yontemIki (ArrayList<Integer> liste) {
        // listede ki 28 ve 8 sayılarının yerini değiştirelim
        int s1 = 28;
        int s2 = 8;
        int i1 = liste.indexOf(28);
        int i2 = liste.indexOf(8);
        liste.set(i1,s2);
        liste.set(i2,s1);
        return liste;

    }
    private static ArrayList<Integer> yontemUc (ArrayList<Integer> liste) {
        liste = new ArrayList<>(Arrays.asList(44, 28, 18, 36, 65, 97, 84, 16, 39, 8));
        int index1 = 0;
        int index2 = liste.size()-1;

        Collections.swap(liste,index1,index2);
        return liste;
    }

}








