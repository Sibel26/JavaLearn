package P08_Loops2.L01_ForLoops.Tasks02;

public class Task02_09 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin
        String str = "SelaMlAR";
        String harf;
        for (int i = 0; i < str.length(); i++) {
            harf = str.substring(i, i +1 );
            if (i % 2 == 0) System.out.print(harf.toUpperCase()+" ");
            else System.out.print(harf.toLowerCase()+" ");
        }
        System.out.println();
        //* cozum 2

        boolean buyukSirasi=true;
        for (int i = 0; i < str.length(); i++) {
            harf = str.substring(i, i +1 );
            if (buyukSirasi) {
                System.out.print(harf.toUpperCase()+" ");
                buyukSirasi=false;
            }
            else {
                System.out.print(harf.toLowerCase()+" ");
                buyukSirasi=true;
            }

        }

        //* cozum 32

        buyukSirasi=true;
        for (int i = 0; i < str.length(); i++) {
            harf = str.substring(i, i +1 );
            if (buyukSirasi) {
                System.out.print(harf.toUpperCase()+" ");

            }
            else {
                System.out.print(harf.toLowerCase()+" ");

            }
            buyukSirasi = !buyukSirasi;

        }


    }
}
