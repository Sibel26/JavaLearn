package D_HomeWork;

public class Adres {
    String mahalle;
    String cadde;
    int no;

    public Adres() {
    }

    public Adres(String mahalle, String cadde, int no) {
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.no = no;


    }

    @Override
    public String toString() {
        return "Adres{" +
                "mahalle='" + mahalle + '\'' +
                ", cadde='" + cadde + '\'' +
                ", no=" + no +
                '}';
    }
}




