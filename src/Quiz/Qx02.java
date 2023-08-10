package Quiz;

public class Qx02 {
    public static void main(String[] args) {
        // tek boyutlu  n elmanlı bir dizi veriliyor
        // bunu 2 boyutlu bir diziye aktarın
        // aktarılacak dizinin 2.boyutu 2 dir, çift sayılar ilk satıra , tekler sonraki satıra gelecek şekilde
        // input:  int[] arr  = {10, 4, 5, 6, 6, 22, 4, 7, 9} // tek ve cift sayac bulabilirsin
        // output   arrNew[0] = {10, 4, 6, 6, 22, 4}
        //          arrNew[1] = {5, 7, 9}
        

       // arrNew[0] =new int[];  arrNew[1] =new int[];
int[] arr = {10, 4, 5,  6, 6, 22, 4, 7, 9};
        int [] [] arrY = new int [2][];
        int counter=0;
        for (int i=0; i<arr.length; i++) {
            if(arr[i]%2==0) counter++;
        }
        arrY [0] = new int[counter];
        arrY[1] = new int[arr.length-counter];
        int iCift=0;
        int iTek=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) {
                arrY[0][iCift] =arr[i];
                iCift++;
            }else{
                arrY[1][iTek] =arr[i];
                iTek++;
            }
        }
    }
}
