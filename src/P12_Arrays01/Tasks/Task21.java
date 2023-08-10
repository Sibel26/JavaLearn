package P12_Arrays01.Tasks;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
// basla sonu kontrol et anlamina geliyor
        int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
        for (int i = 0; i <arr1.length ; i++) {
           // System.out.println(i+","+ (arr1.length-1-i));        sor!!
            if (arr1[i] != arr1[arr1.length-1-i]) {
                System.out.println("simetrik degildir: ");
                break;
            }
        }
// bir ala rib

    }
}

