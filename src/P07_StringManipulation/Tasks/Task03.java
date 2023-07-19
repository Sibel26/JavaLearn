package P07_StringManipulation04.Tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz


        String str = "alamanya";
        //cozum 1,
        // 1. 'a' yi bulup '*' yapalim "*lmanya"
        // sonra yine birinci a yi  bulalim bu aslinda 2. a dir
        // cozum 2

        String ilkA = str.replaceFirst("a","*");
        int a = ilkA.indexOf("a");

        System.out.println(ilkA);
        System.out.println(a);

        // str=str.replaceFirst("a", "*");
        //        System.out.println(str.indexOf("a")); halime h

        //cozum 2
        //biraz karisik 2.cozum önemli degil












    }
}
