package P24_Encapsulation.Example02;

public class Runner {
    public static void main(String[] args) {

        Araba c1 = new  Araba();
        c1.setModel("XC60");
        c1.setRenk("Kırmızı");
        c1.setMotor(1000);
        c1.setYil(2025);
        System.out.println(c1);
        System.out.println("==================================");

        Araba c2 = new Araba("X3","Beyaz",3000,2020);
        System.out.println(c2.getModel() + " " + c2.getRenk() + " " + c2.getMotor() + " " + c2.getYil());
        System.out.println(c2);
        System.out.println("==================================");
        Araba c3 = new Araba("Passat", "Metalic",2500, 2022);
        System.out.println(c3.getModel() + " " + c3.getRenk() + " " + c3.getMotor() + " " + c3.getYil());



    }
}
