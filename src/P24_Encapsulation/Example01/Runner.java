package P24_Encapsulation.Example01;

public class Runner {

    public static void main(String[] args) {

//        Hayvanlar animal = new Hayvanlar("Canavar","dog",1996,true);
//        System.out.println("Animal name => "+animal.getName()+ " " +" Yırtıcı mı "+animal.isYirtici());
//        System.out.println("animal.getKind() = " + animal.getKind());
//        System.out.println("animal.getBirthYear() = " + animal.getBirthYear());
//        System.out.println("animal.getName() = " + animal.getName());
//
//        Hayvanlar animal1 = new Hayvanlar();
//
//        animal1.setKind("kuş"); // burda set ile parametreleri ekledik
//        animal1.setName("leylek");
//        animal1.setBirthYear(1995);
//        System.out.println("animal1.getName() = " + animal1.getName());
//        System.out.println("animal1.getKind() = " + animal1.getKind());
//        System.out.println("animal1.getBirthYear() = " + animal1.getBirthYear());
        System.out.println("---------------///////////////////----------------");

        Hayvanlar hh = new Hayvanlar("Tiger","Bengal Tiger",2020,true, new Species("Kahverengi",140.6,false));
        System.out.println("hh.getSpc().getRengi() = " + hh.getSpc().getRengi());
        System.out.println("hh.getSpc().getKilosu() = " + hh.getSpc().getKilosu());
        System.out.println("hh.getSpc().isEvcilMi() = " + hh.getSpc().isEvcilMi());
        System.out.println(hh);

      //  System.out.println(hh.toString());


    }



}