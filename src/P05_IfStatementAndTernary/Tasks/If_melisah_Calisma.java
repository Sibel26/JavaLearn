package P05_IfStatementAndTernary.Tasks;

public class If_melisah_Calisma {


    public static void main(String[] args) {
        // Basic if
        // a sayısı 5 den buyuk mü ?
        // a sayısı 10 dan buyuk mu ?

        int a = 6;
        if (a>4) {
            System.out.println("evet");
        }

        // if- else
        // a sayısı 5 den buyuk mu ?

        if(a>5){
            System.out.println(" buyuk");
        } else {
            System.out.println("kucuk veya esit");
        }

        // if - elseif
        // a sayısı 5 den buyuk mu kucuk mu ?

        // 1.yol
        // birbirinden bagımsız ifler kullanabiliriz.
        // bagımsız ifler varsa her sarta ugrar

        if(a>5){
            System.out.println("buyuk");
        }

        if (a<5) {
            System.out.println("kucuk");
        }

        // 2. yol
        // else den sonra tek satır kod yazılacaksa süslü parantez
        // kullanmaya gerek yoktur.
        if(a>5){
            System.out.println("buyuk");
        } else if (a<5){
            System.out.println("kucuk");
        } else System.out.println("esit");









    }




}
