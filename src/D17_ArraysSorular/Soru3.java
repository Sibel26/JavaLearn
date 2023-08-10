package D17_ArraysSorular;

public class Soru3 {
    public static void main(String[] args) {
//cok boyutlu diziler, cok kullanilmaz,interview lerde cok kullanilir
int[][][] dizi = { { {1,2,},{4,1,6,},{1,4,2},{1,4,4,6,}}};


for (int i = 0; i < dizi.length; i++) {
    for (int j = 0; j < dizi[i].length; j++) {
        for (int k = 0; k < dizi[i][j].length; k++) {
            System.out.print(dizi[i][j][k]+" ");
        }
        System.out.println();
    }
    System.out.println();
}

    }
}
