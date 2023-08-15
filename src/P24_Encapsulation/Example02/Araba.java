package P24_Encapsulation.Example02;

import java.time.LocalDate;

public class Araba {
     /*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    public Araba() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if ( motor <= 1000) {

            System.out.println("Motor en küçük 1000 cc olmalıdır.");
            this.motor = 1000;

        }else this.motor = motor;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        if ( yil > year){
            System.out.println("Yıl, güncel yıldan büyük olamaz.");
            this.yil = year;
        }else {
            this.yil = yil;
        }

    }

    @Override
    public String toString() {
        return "Araba dır {" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}
