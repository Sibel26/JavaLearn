package P12_Arrays02.Tasks;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int arr1[] = { 5, 2, 9, 4, 4, 9, 2, 5 };
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] != arr1[arr1.length-1-i]) {
                System.out.println("simetrik değildirr");
                break;
            }
        }
        // cozum 2
        boolean simetriktir=true;
        for (int i = 0; i < arr1.length/2 ; i++) {
            if (arr1[i] != arr1[arr1.length-1-i]) {
                simetriktir=false;
                break;
            }
        }
        if (simetriktir) System.out.println("simetriktir");
        else System.out.println("Simetrik değildir");

    }
}

