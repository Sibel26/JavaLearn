package P21_StaticKeyWord.Tasks.Task01;

public class AnaClass {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayaan methodolan
     Rectangle isminde Class create ediniz.
     Ana class'da obj ile cevre ve alan değerelrini print eden code create ediniz.
    */
     public static void main(String[] args) {
         Rectangle rr = new Rectangle(10,20);
         System.out.println(rr.Alan());
         System.out.println(rr.Cevre());
     }
}
