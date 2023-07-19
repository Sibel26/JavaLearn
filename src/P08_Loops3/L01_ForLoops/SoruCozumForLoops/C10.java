package P08_Loops3.L01_ForLoops.SoruCozumForLoops;

public class C10 {
    public static void main(String[] args) {
        // verilen stringi tersten yazdırınız.
        String str = "Selamlar";
        for (int i = str.length()-1; i >=0 ; i--) {
            //System.out.println(i);
            System.out.print(str.charAt(i));
        }

        // 2.yöntem
        System.out.println();
        for (int i = 0; i <str.length() ; i++) {
            // System.out.println("i="+i+"   "+(str.length()-1-i) );
            System.out.println(str.charAt(str.length()-1-i));
        }
    }
}
