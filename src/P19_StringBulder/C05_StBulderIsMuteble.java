package P19_StringBulder;

public class C05_StBulderIsMuteble {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Selamlar");
        String str = "Selamlar";
        stbMetot(sb,str);
        System.out.println("StrBulder : "+sb);
        System.out.println("String    : "+str);
        //  metotta sb nin de değişmesini istemiyoruz
        // yeniMetot(sb.toString()
    }

    private static void stbMetot(StringBuilder sb2, String str2) {
        StringBuilder sbYeni = new StringBuilder();
        sbYeni.append(sb2);
        sbYeni.append(" hasan");
        str2=str2+" hasan";
        System.out.println(sbYeni);
        System.out.println(str2);
    }
}
