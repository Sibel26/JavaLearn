package P07_StringManipulation_Version1.Tasks02;
import java.util.Scanner;
public class Task02_04 {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
       // "e" harfinin indexini bulun

        String str = "Selim Caner";
        int indexBosluk = str.indexOf(" ");
        int indexE = str.indexOf('e', 5); // e nin indexi
        //
        int indexE2 = str.indexOf( 'e',str.indexOf(' '));
        System.out.println(indexE);





    }
}
