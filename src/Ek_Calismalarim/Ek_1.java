package Ek_Calismalarim;

public class Ek_1 {

    public static void main(String[] args) {
//char la cözüm
        //Bir String in ilk harfini bulma
        //Birinci yol charAt
        String str = "Araba";
         char ilkHarf = str.charAt(0); //A
        System.out.println(ilkHarf);
        char ikinciHarf= str.charAt(1); //r
        System.out.println(ikinciHarf);
        char ücüncüHarf = str.charAt(3);//b
        System.out.println(ücüncüHarf);
        char sonHarf1 = str.charAt(4);//a
        System.out.println(sonHarf1);

        char sonHarf2 =str.charAt(str.length()-1);//a
        System.out.println(sonHarf2);
        System.out.println();


        //NOT;
//Bir String in uzunlugu length

// Bir String in son harfinin indexi length -1 dir



//substring le cözüm

        //Tek parametreli,verilen String in sonuna kadar yazar
        //Örnek; str=Ali str.substring(1)=li yazdirir
        //Cift parametreli substring te ilk parametre dahil olacak sekilde baslar,ikinci parametre alinmayacak
       // sekilde string i böler.

        String str1 = "Güzel"; //Tek parametreli,verilen String in sonuna kadar yazar
        System.out.println(str1.substring(0)); // Bastan baslar ,(sifirda) strig in sonuna kadar yazar Güzel
        System.out.println(str1.substring(1)); //üzel
        System.out.println(str1.substring(2)); //zel
        System.out.println(str1.substring(3)); //el
        System.out.println(str1.substring(4)); //l
        //str1.substring(5); //hata verir cunku 5.index yok
        System.out.println(str1);
        System.out.println();



        String str2 = "Bahce";
        System.out.println(str2.substring(0, 1));//B yazdirir
        System.out.println(str2.substring(0, 2));//Ba 0ve 1 dahil 2 haric
        System.out.println(str2.substring(0, 3));//Bah
        System.out.println(str2.substring(1, 3));//ah
        System.out.println(str2.substring(2, 3));//h
        System.out.println(str2.substring(0, 5));//Bahce














    }




}
