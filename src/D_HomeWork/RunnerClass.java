package D_HomeWork;

public class RunnerClass {
    public static void main(String[] args) {
        //1.yol
        Yonetici obje1= new Yonetici(new Personel(new Adres("cicek","uzunyol", 3),
                "Ayse","Tester",9000) ,"Lisans","bekar");

        //3.yol
        Adres adr= new Adres ();
        adr.cadde = "gül";
        adr.mahalle = "tepebasi";
        adr.no = 36;
        Personel prs = new Personel();
        prs.adres = adr;//yukaridaki özellikleri icine attik
        prs.maas = 300000;
        prs.name = "Melisa";
        prs.bolum ="QA";
        Yonetici ytr = new Yonetici();
        ytr.egitimDurumu = "Lisans";
        ytr.medeniHali = "Bekar";
        ytr.personel = prs;

        System.out.println(ytr.personel);



    }
}
