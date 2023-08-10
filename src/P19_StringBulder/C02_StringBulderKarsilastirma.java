package P19_StringBulder;

public class C02_StringBulderKarsilastirma {
    public static void main(String[] args) {
        StringBuilder sb1 =new StringBuilder();
        StringBuilder sb2 =new StringBuilder();
        sb1.append("hasan");
        sb2.append("has");
        sb2.append("an");
        System.out.println(sb1+" "+sb2);
        System.out.println(System.identityHashCode(sb1));
        System.out.println(System.identityHashCode(sb2));
        // StringBulder da equals ile karşılaştırma yapımaz, çünkü true olması için içeriğin aynı olması yetmez
        // hem içerik hem referenas aynı olmalıdır

        // önemli
        if (sb1.compareTo(sb2)==0) System.out.println("eşittir");
        else System.out.println("eşit değildir");

        System.out.println(sb1.compareTo(sb2));
        String str = "hasan";
        //  sb1 ile str yi karşılaştıralım
        System.out.println(sb1.toString().equals(str));

    }
}
