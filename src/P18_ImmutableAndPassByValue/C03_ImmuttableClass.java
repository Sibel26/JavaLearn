package P18_ImmutableAndPassByValue;

public class C03_ImmuttableClass {
    public static void main(String[] args) {
        int a=10;
        System.out.println("  7 satır " + System.identityHashCode(a));
        metotC03(a);

        System.out.println(a);
    }

    private static void metotC03(int b) {
        System.out.println(" 12 satır " + System.identityHashCode(b));
        b=b+2;
        System.out.println(" 14 satır " + System.identityHashCode(b));

    }
}
