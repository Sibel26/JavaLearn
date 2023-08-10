package P12_Arrays.Tasks02;

import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {

        String str2 = "Selamlar mehmet bey nasılsınız";
        String[] strArr2 = str2.split(" ");
        System.out.println(Arrays.toString(strArr2));

        String str3 = Arrays.toString(strArr2);
        System.out.println(str3);



        // yukarıdaki strArr2 dizisini string cevirin ama str2 dekinin aynısı olsun
        // en az 2 yöntem
        //split istedigin yerden bölmeye yarar

//string de hiclik aliriz elemani etkilememk icin
        String str4 = " ";
        for (int i = 0; i < strArr2.length; i++) {
            if(i==strArr2.length-1) {   //sondaki bosluk olmasin diye if actik
                str4 +=strArr2[i];
            }else str4 += ""+strArr2[i] + " ";
        }
        System.out.println(str4);
    }
}
