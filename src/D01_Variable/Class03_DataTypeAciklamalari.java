package D01_Variable;

public class Class03_DataTypeAciklamalari {
    public static void main(String[] args) {
        String str1 = "Hasan";
        String str2 = "jamil";
        String str3 = str1+" "+str2;
        String str4= str2+" "+str1;


        System.out.println (str3);
        String s1 = "7";
        String ss = s1+s1;
        System.out.println("ss = " + ss);

        String str5 = str1+s1;
        System.out.println(str5);

        int sayi = 9 ;
        str5 = str5+sayi;
        System.out.println(str5);

        double dd =3;
        str5 = str5+dd;
        System.out.println(str5);

        String str6 =""+sayi;

        str6 =""+sayi+dd;
        str5= sayi+dd+"";

        System.out.println(str6);
        System.out.println(str5);






    }











}
