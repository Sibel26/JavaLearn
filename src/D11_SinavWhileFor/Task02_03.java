package D11_SinavWhileFor;

public class Task02_03 {
    public static void main(String[] args) {
        // 1 den 50 ye kadar üçe bölünebilen sayıları büyükten küçüğe doğru ekrana yazdırın

int sayi = 50;
while (sayi>=1) {
    if(sayi %3 == 0) {
        System.out.println(sayi+ "  ");
    }
    sayi--;
}


    }
}
