package D08_Substring;

public class Replaceörnegi {
    public static void main(String[] args) {
//soru1
// verilen string teki "al" geçen ifadeleri, kaldırınız
        String str = "selamlar alı al kardeş";

        System.out.println(str.replace("al", ""));

//soru2
        String str1 = "selamlar alı al karalı";
        //Verilen string de Ali yerine alı yazilmistir,
        //bunlari bulup düzeltin
        String a = "selamlar alı al karalı";

        a = a.replace(" alı ", " Ali ");
        System.out.println(a);

//bosluklari ile alman gerekli!! Ali leri yazarken


//String s2= str.replace(" alı "," Ali ");
//System.out.println(s2);      halime hanimin



    }









}
