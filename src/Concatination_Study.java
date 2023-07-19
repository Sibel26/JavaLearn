public class Concatination_Study {
    public static void main(String[] args) {

        // SORU 4)
        System.out.println("***** CONCATINATION *****");
        String word = "java";
        int sayi = 30;
        System.out.println(word+"candir"); // javacandir
        System.out.println(word+sayi); // java30
        System.out.println();
        // TOPLAMA
        System.out.println(word+sayi+1); // java301
        System.out.println(word+(sayi+1)); // java31
        System.out.println(sayi+1+word); // 31java
        System.out.println((sayi+1)+word); // 31java
        System.out.println(sayi+(1+word)); // 301java
        System.out.println();
        // CARPMA / BOLME
        System.out.println(word+sayi*3); // java90
        System.out.println(word+(sayi*3)); // java90
        System.out.println(word+sayi/3); // java10
        System.out.println(sayi / 3 + word); // 10java
        System.out.println();
        // CIKARTMA
        System.out.println(sayi-2+word); // 28 java
        // System.out.println(word+sayi-5);
        System.out.println(word+(sayi-6)); // java24
        System.out.println((sayi-6)+word); // 24java
    }
}
