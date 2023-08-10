package P13_Arrays03.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T02 {
    public static void main(String[] args) {
        /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        for (int i = fruits.size()-1; i >= 0; i--) {
            System.out.println(fruits.get(i) + ",");
        }


    }
}
