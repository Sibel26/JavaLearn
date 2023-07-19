package D07_StringManipulation;

public class C00_StringMani {

    public static void main(String[] args) {
        String myStr= "Hello";
        String myStr2= "Mehmet";
        char result1 = myStr.charAt(0);



//bosluk bulma "Faruk kadi" bosluk kacinci karakterdir?

        String str = "Faruk kadi";

        int b = str.indexOf(" ");
        System.out.println(b);

// str stringinde bosluktan sonra kac karakter vardir

        String str3 ="Faruk Kadı";

        int num = str3.length() -1 - str3.indexOf(" ");
        System.out.println(num);


//verilen stringin ortadaki karakterini print ediniz.String 5 karakter ise ortanca karakter 2 dir (01234) cunku

       int ortanca = str.length()/2;
        System.out.println(str.charAt(ortanca));
        System.out.println( str.charAt(str.length()/2));














    }








}
