package P18_ImmutableAndPassByValue;

public class C04_Immutable {
    public static void main(String[] args) {
        String str = "Hasan";
        System.out.println(System.identityHashCode(str));
        str = str.toLowerCase();
        System.out.println(System.identityHashCode(str));
        str = str.toUpperCase();
        System.out.println(System.identityHashCode(str));
    }
}
