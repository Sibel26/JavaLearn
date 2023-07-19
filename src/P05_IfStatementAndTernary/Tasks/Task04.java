package P05_IfStatementAndTernary.Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*Task->
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf"
		 Bu character kucuk harf ise "Kucuk Harf"
		 Bu character harf degil ise "Harf Degil"  print eden code create ediniz.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir character giriniz");

		char ch =scan.next().charAt(0);// charAt icine (1) ne girersen o siradaki karateri yazar,konsola girilen waerttz örnegin w dir
		if (ch>='A' && ch<='Z') {
			System.out.println("Buyuk harftir");
		}else {
			if (ch>='a' && ch<='z') {
				System.out.println("Kucuk harftir");
				}else {
				System.out.println("Harf degildir");
			}
		}


       // cozum 2
		if (Character.isUpperCase(ch)) {
			System.out.println("Buyuk harftir");
		}else if  (Character.isLowerCase(ch)) {
			System.out.println("Kucuk harftir");
		}
		else {
            System.out.println("Harf degildir");
        }

/* Character metodlari
     * char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile char metodu ile
 */
}

}
