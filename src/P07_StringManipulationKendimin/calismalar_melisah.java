package P07_StringManipulationKendimin;

public class calismalar_melisah {

    public static void main(String[] args) {
        //startsWith  __> bize stringin baslangic degerinin dogurlugunu verir
        //             --> 2 parametli ise , verilen indexin hangi dgerle başladıgını dogrular
        String word = "Ozcan";

        System.out.println(word.startsWith("O"));  // true
        System.out.println(word.startsWith("o"));  // false
        System.out.println(word.startsWith("a", 3)); // true
        System.out.println();
        // endsWith -->
        System.out.println(word.endsWith("n"));  // true
        System.out.println(word.endsWith("k"));   // false































    }






}
