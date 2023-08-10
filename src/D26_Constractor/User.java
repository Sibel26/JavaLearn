package D26_Constractor;

public class User {

    /*
   --> Bir User clası olusturun

   --> Classın variables larını olusturun
   name      (String)
   country   (String)
   age       (int)
   bırthDate (String)


   --> name , age özellikleri olan yeni bir obje üretin
   --> name , age , country , birthdate özellikleri olan yeni bir obje üretin
   --> Önce objeleri yazdırın
   --> Sonra objelerin özelliklerini tek tek yazdırın

*/

String name;
String country;
int age;
String birthDate;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, String country, int age, String birthDate) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public static void main (String[] args) {
    User obje1 = new User("Ayse",3);
    User obje2 = new User("Ali",6);

    User obje3=new User("Fatma","Deutschland",1,"8.10.2022");

    //Tüm Objeyi yazdirabilmek icin class ta toString metodu genert(general, sagtus sonra toStrim) etmemiz gerekir.

        System.out.println(obje1);
        System.out.println(obje2);
      //  --> Sonra objelerin özelliklerini tek tek yazdırın
        System.out.println(obje3.name);
        System.out.println(obje3.country);
        System.out.println(obje3.birthDate);




    }
}




