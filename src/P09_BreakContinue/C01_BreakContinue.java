package P09_BreakContinue;

public class C01_BreakContinue {
    public static void main(String[] args) {

        for (int i = 1; i <=20 ; i++) {
            if (i%7 == 0) {
                break;
            }
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("bitti");
        for (int i = 1; i <=20 ; i++) {
            if (i%7 == 0) {
                continue;
            }
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("bitti2");
    }
}
