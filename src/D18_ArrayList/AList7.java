package D18_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AList7 {

    public static void main(String[] args) {
    /*
    İsmi changeInArraylist() olan bir method oluşturun.
    Parametre olarak String ArrayList, String s1, String s2
       Arraylist'te s1'i s2 olarak değiştirin
    Return String arrayList
    Örneğin;
    Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
    s1 = blue
    s2 = yellow
    Tüm blue 'ları yellow'a dönüştürün.
    cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
*/
        //melisa h.yaptik

        ArrayList<String>colors = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));//elemanlari icine atiyor Arrays.asList

for (int i =0; i<colors.size();i++) {
    if(colors.get(i).equals("blue")) {
        colors.set(i, "yellow");
    }
}
        System.out.println(colors);


    }
}


