package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class _09__if_else_with_logical_operators {
    public static void main(String[] args) {
//        str bir String'dir.
//        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise
//        "Orange has six letters" yazdı
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni yazınız : ");
        String str = scanner.nextLine();
        if (str.equals("Orange") && str.length()==6) {
            System.out.println("Orange has six letters");
        }


        // && ile & arasindaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

    }
}
