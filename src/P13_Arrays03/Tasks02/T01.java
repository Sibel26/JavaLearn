package P13_Arrays03.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;

public class T01 {
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
//Bu cevapta  dizi icindeki her elemani blue stringine esit mi diye kontrol et eger esitse yellow ile degistir


            ArrayList <String> list = new ArrayList<>(Arrays.asList("yellow","red","blue","red","blue"));

            String s1="blue";
            String s2="yellow";
            changeInArrayList(list,s1,s2);
            System.out.println(changeInArrayList(list,s1,s2));


        }

        private static ArrayList<String> changeInArrayList(ArrayList<String> list, String s1, String s2) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(s1)){
                    list.set(i,s2);
                }
            }
            return list;
        }



    }

