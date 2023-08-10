package P13_Arrays04.Tasks02;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<String> liste2=new ArrayList<>();
        ArrayList<String> liste = new ArrayList<>(List.of( "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        for (int i = 0; i <liste.size() ; i++) {
            liste2.add(0,liste.get(i));
            System.out.println(liste2);
        }

    }
}
