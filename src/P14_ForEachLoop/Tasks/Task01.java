package P14_ForEachLoop.Tasks;

public class Task01 {
    public static void main(String[] args) {


        // task-> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz..
        // with for-each ortak elemanları yazdırın
        String[] arr1 = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String[] arr2 = {"gülsüm", "musty", "ayşe", "enise", "ciğdem", "cüneyt"};
        System.out.println("Ortak elemanlar:");

        for (String e1 : arr1) {
            for (String e2 : arr2) {
                if (e1.equals(e2)) {
                    System.out.println(e1);
                }
            }
        }
    }






}
