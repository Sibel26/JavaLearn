package P12_Arrays02.Sorular;

public class S02 {
    public static void main(String[] args) {
        // sayiList dizisinin en buyuk elemanını bulunuz
        int[] sayiList={10,3,4,67,5,6};
        int eB = sayiList[0];
        for (int i =1; i<sayiList.length; i++){
            if (sayiList[i] > eB) eB = sayiList[i];
        }
        System.out.println("Dizinin en büyük elamanı => " + eB);


    }
}
