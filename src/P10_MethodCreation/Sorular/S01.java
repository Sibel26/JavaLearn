package P10_MethodCreation.Sorular;

public class S01 {
    // task-> girilen 3 sayının ortalamasını print eden ortalamaBul adında bir METHOD create ediniz
    public static void main(String[] args) {

        ortalamaBul();
    }

    private static void ortalamaBul() {
        int n1 = 22;
        int n2 = 17;
        int n3 = 45;
        double avg = (n1+n2+n3) / 3.0;
        System.out.println(avg);
    }
}
