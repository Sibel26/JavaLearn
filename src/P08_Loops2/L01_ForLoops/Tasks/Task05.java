package P08_Loops2.L01_ForLoops.Tasks;

public class Task05 {
    public static void main(String[] args) {
          /*
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        # # # # #
        şekli print eden code create ediniz,
        print içerisinde sadece aşağıdaki str 1 kez kullanılabilr ve cod da sadece 1 print olmalı
        String str="# "
         */
//        for (int i = 0; i <6 ; i++) {
//            System.out.println("# # # # #");
//        }
        String str="# ";
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(str);
            }
            System.out.println();
        }




    }
}
