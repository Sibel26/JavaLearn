package P13_Arrays04.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T05 {
    public static void main(String[] args) {
         /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10,199}};

        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                liste.add(arr[i][j]);

            }
        }
        System.out.println(liste);

        // normal array a aktarmamız istenseydi

        int uzunluk=0;
        for (int i = 0; i <arr.length ; i++) {
            uzunluk = uzunluk + arr[i].length;
        }
        int k=0;
        int [] arr2 = new int[uzunluk];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr2[k] = arr[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));


    }
}
