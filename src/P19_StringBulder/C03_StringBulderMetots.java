package P19_StringBulder;

public class C03_StringBulderMetots {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(" ---- length : "+sb.length()+"   capacity:"+sb.capacity());
        sb.append("Selamlar hasan");
        System.out.println(" ---- length : "+sb.length()+"   capacity:"+sb.capacity());
        sb.append(" bey");
        System.out.println(" ---- length : "+sb.length()+"   capacity:"+sb.capacity());
        /*
        sb.delete();
        sb.setCharAt();
        sb.charAt();
        sb.insert();
        sb.deleteCharAt();
        sb.indexOf();
        sb.reverse();
        sb.toString()
        sb.replace()
        sb.length()
        sb.isEmpty()
         sb.capacity();
        */
        System.out.println(sb.delete(2,4));
        System.out.println(sb.deleteCharAt(2));// = sb.delete(2,3)
        System.out.println(sb.charAt(7));
        // sb stringbulderının 10.carketerinden itibaren, " burasayız " char dizisiniz
        // 2. karekterinden 5. karekterine kadar olanı koy.
        System.out.println(sb.insert(10," burasayız ",2,5));
        System.out.println(sb.insert(0,100));
        System.out.println(sb.indexOf("ura"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(1,20," hasan "));
        System.out.println(sb.subSequence(1,4));
        System.out.println(sb.substring(1,4));

    }
}
