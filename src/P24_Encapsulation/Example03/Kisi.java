package P24_Encapsulation.Example03;

public class Kisi {
    private String ad;
    private String soyad;
    private String password= "password123456";
    private int yas;

  public Kisi () {

  }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public void setYas(int yas) {
        if (yas>=0) {
            this.yas = yas;
        }else{
            System.out.println("yas sifirdan kucuk olamaz");
            this.yas =99;
        }

    }

    public String getPassword() {
        return password;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }
}





