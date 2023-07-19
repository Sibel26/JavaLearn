package P07_StringManipulation_Version1.Tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz


        String str = "alkmanya";

        // ** cozum 1 ,
        // 1. 'a' yı bulup '*' yapalım     "*lamanya"
        // sonra yine birinci a yı bululım bu aslında 2. a dır

        String i = str.replaceFirst("a","*");
        int a = i.indexOf("a");

        System.out.println(i);
        System.out.println(a);

        // cozum 2
        int biriciA = str.indexOf('a');
        int ikinciA = str.substring(biriciA+1).indexOf("a")+biriciA+1;
        System.out.println(ikinciA);

        // cozum 3
         biriciA = str.indexOf('a');
         ikinciA = str.indexOf('a',biriciA+1);
         // indexOf , from indexten itibaren tarar
        System.out.println("ikinciA = " + ikinciA);

        // 3. 'a'
        int ucuncuA = str.indexOf('a',ikinciA+1);





    }
}
