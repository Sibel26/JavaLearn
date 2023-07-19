package D02_DataType;

public class Class02_Wrapper {
    public static void main(String[] args) {
        String str = "Hasan";
        System.out.println(str.toLowerCase ());
        System.out.println(str.toUpperCase ());
        System.out.println(str.length ());
        int s1 = 10;
        Integer s2 = 10;
        int s10 = s2;
        Integer s20 = s1;
        s10 = Integer .MIN_VALUE;
        s20 = Integer.MIN_VALUE;
        System.out.println(" in sayi üst limiti = "+Integer.MAX_VALUE);
        System.out.println(" in sayi alt limiti = "+Integer.MIN_VALUE);

        int sayi1 = 22;
        int sayi2 = 33;
        int sayi3 = 44;
        int kucuk = Integer.min( sayi1,sayi2);
        System.out.println(kucuk);


        int toplam = sayi1 +sayi2;
        System.out.println("toplam = " +toplam);

        toplam = Integer.sum(sayi1,sayi2);
        System.out.println("toplam = + toplam");


         toplam =Integer.sum(sayi1, sayi2);
        Integer toplam2=Integer.sum(toplam, sayi3);
        System.out.println(toplam2);


        char ch = '5';
        System.out.println(Character.isDigit(ch));




























    }





















}
