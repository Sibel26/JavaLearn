package P24_Encapsulation.Example03;

public class Runner {
     /* task
    Kisi pojo class için fields-> ad, soyad, password(String), yas
    tum field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    (password encapsulated update edilmemeli.)
    yas variable negatif değer girmeye karsı encapsulated

    runner class'da obj ile field ları print eden code create ediniz
     */

    public static void main(String[] args){

        Kisi kisi1= new Kisi();
        kisi1.setAd("Ümit");
        kisi1.setYas(13);
        kisi1.setSoyad("Tk");
        System.out.println(kisi1.getAd()+kisi1.getYas()+kisi1.getSoyad()+kisi1.getPassword());


    }




}
