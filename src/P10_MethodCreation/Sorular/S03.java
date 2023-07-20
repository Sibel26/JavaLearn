package P10_MethodCreation.Sorular;

public class S03 { public static void main(String[] args) {
// task-> girilen 3 sayının ortalamasını print eden ortalamaBul adında bir METHOD create ediniz
    int n1 = 22;
    int n2 = 17;
    int n3 = 45;
    ortalamaBul(n1,n2,n3);


}

    private static void ortalamaBul(int n1, int n2, int n3) {
        double sonuc = (n1+n2+n3) / 3.0;
        System.out.println("Ortalama = " + sonuc);
    }
}
