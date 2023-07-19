package P08_Loops3.L02_WhileLoops;

public class C01_WhileLoops {
    public static void main(String[] args) {
         /*
        Başlangıç bitiş ve değişim değerleri net  bilinen
        tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
         */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        // 3 ve 20 dahil
        int n=10;
        for (int i = 0; i <n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        while (i<n) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        // cozum
        i = 2;
        while (i<20){
            i++;
            System.out.print(i+" ");
        }

    }
}
