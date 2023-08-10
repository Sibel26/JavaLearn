package P12_Arrays.Sorular;

import java.util.Arrays;

public class S06 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

String [][] a= {{"new jersey","atlanta","ohio"} ,// cift katli array 2D
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};
for (int i =0; i< a.length; i++) {
    for (int j=0;j<a[i].length; j++) { // a i nin elemanina göre hareket ediyor
    if (a[i][j]=="ohio") {
        a[i][j] ="Florida";
    }
    }
}
        System.out.println(Arrays.deepToString(a));




    }
}

