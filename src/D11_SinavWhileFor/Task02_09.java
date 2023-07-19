package D11_SinavWhileFor;

public class Task02_09 {
    public static void main(String[] args) {
        /* Verilen n sayısına göre aşağıdaki şekli oluşturunuz
        n=5;
        * * * * *
        * * * *
        * * *
        * *
        *
         */
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    }

