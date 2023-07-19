public class Increment_Decrement_Study {
    public static void main(String[] args) {

        // SORU 3)
        System.out.println("***** ARTTIRMA *****");
        int e = 3;

        // önce yazdır sonra arttır hafızaya al e = 4
        System.out.println(e++); // 3
        // sadce toplama işlemi var ama atama yok ! sonuc 5 olur ama e = 4
        System.out.println(e+1); // 5
        // önce arttır sonra yaz e = 5  hafızada da e = 5 tir
        System.out.println(++e); // 5

        System.out.println(++e + e++ + " sonucu buldun mu ? " + e++ + --e); // 12sonucu buldun mu77
        System.out.println();

    }
}
