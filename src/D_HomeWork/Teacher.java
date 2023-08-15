package D_HomeWork;

import java.util.ArrayList;

public class Teacher {
    String ad;
    String name;
    String soyad;
    String brans;
    int id;
    int tecrube;
    double maas;
    boolean emekli;
     /*
        Constructor içerisinden yukarıda(class level) tanımlanan object değişkenlerine(instance variable) erişilmek istenirse this keyword kullanılır.
        this keyword, o anda üzerinde işlem yapılan object'in referansını return eder ve böylece nesne değişkenlerine(instance variable) erişilir.
         Ancak nesne değişkenleri(instance variable) ile cons. parametre değişkenlerinin isimleri farklı olsaydı(soyad = Soyad) this keyword gerek kalmayacaktı.
          Bu kural sadece constructor için değil, bütün metotlar için geçerlidir.
     Task : Teacher clasından 1 nesne üretin, daha sonra bu nesne yardımı ile 5 adet öğretmen için veri oluşturun
     bu verileri bir arraylist atıp toString metotunu override edip kullanarak yazdırın
         */

    public Teacher(String ad, String name, String soyad, String brans, int id, int tecrube, double maas, boolean emekli) {
        this.ad = ad;
        this.name = name;
        this.soyad = soyad;
        this.brans = brans;
        this.id = id;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "ad='" + ad + '\'' +
                ", name='" + name + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", id=" + id +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }
    public static void main(String[] args) {
        ArrayList<Teacher> teacherList = new ArrayList<>();

        Teacher teacher1 = new Teacher("Ali", "Ahmet", "Yılmaz", "Matematik", 101, 10, 5000, false);
        teacherList.add(teacher1);

        teacherList.add(new Teacher("Ayşe", "Mehmet", "Demir", "Fizik", 102, 8, 4500, false));
        teacherList.add(new Teacher("Can", "Cem", "Kara", "Kimya", 103, 5, 4000, false));
        teacherList.add(new Teacher("Derya", "Serkan", "Taş", "Biyoloji", 104, 3, 3500, false));
        teacherList.add(new Teacher("Emre", "Nihan", "Aydın", "Türkçe", 105, 12, 5500, false));

        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }


}



