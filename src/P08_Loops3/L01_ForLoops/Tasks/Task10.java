package P08_Loops3.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını(harfin kaç adet olduğunu) print eden code create ediniz


        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input = new Scanner(System.in);
        System.out.println("agam bir ifade giresen : ");
        String str = input.nextLine();//javacan

        System.out.print("agam hangi harfi saydıracaksın :");
        char harf=input.next().charAt(0);//a
        int counter = 0;
        for (int i = 0; i <str.length() ; i++) {
            char h = str.charAt(i);
            if(harf == h) counter++;
        }
        System.out.println(counter);

        counter = str.length()-str.replaceAll(""+harf,"").length();

        System.out.println(counter);


    }
}
