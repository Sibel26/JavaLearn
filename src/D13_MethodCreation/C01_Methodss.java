package D13_MethodCreation;

public class C01_Methodss {
    public static void main(String[] args) {

        int a=10, b=20;
        //int enB = Math.max(a,b);
        buyukprintEt(a,b);


    }
public static void buyukprintEt(int num1,int num2) { //void geri dönusu yok demek
    System.out.println(buyukBul(num1,num2));
}
    public static int buyukBul(int a, int b) {
        int buyuk;
        if(a>b) buyuk=a;
        else buyuk = b;
        return buyuk;
    }


}
