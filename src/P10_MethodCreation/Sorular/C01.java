package P10_MethodCreation.Sorular;

public class C01 {

    public static int rastgele(int alt,int ust) {
        int sayi = (int) (Math.random()*(ust-alt+1)+alt);

        // 5 ila 100 arasında bir sayı üretin 100-5+1
        int sayi2 = (int) (Math.random()*96+5);
        int sayi3= (int) Math.round(Math.random()*(ust-alt)+alt);


        return sayi;


    }
}
