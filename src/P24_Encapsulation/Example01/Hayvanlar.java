package P24_Encapsulation.Example01;

public class Hayvanlar {

    private String name;
    private String kind;
    private int birthYear;
    private boolean yirtici;
    private Species spc;

    public Hayvanlar() {
        System.out.println("Obje tanımlandı");

    }

    public Hayvanlar(String name, String kind, int birthYear,boolean yirtici) { // Bu constructor metodudur.
        this.name = name;
        this.kind = kind;
        this.birthYear = birthYear;
        this.yirtici = yirtici;

    }

    public Hayvanlar(String name, String kind, int birthYear, boolean yirtici, Species spc) {
        this.name = name;
        this.kind = kind;
        this.birthYear = birthYear;
        this.yirtici = yirtici;
        this.spc = spc;
    }

    public String getName() { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak için getter metodu kullanarak çağırma yaptık.

        return name;
    }

    public void setName(String name) { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        if(name.length() > 1) {     // ulaşmak  ve güncellemek için setter  metodu kullanarak çağırma yaptık.
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        this.name = name;
    }

   public String getKind() {  // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak için getter metodu kullanarak çağırma yaptık.
        return kind;
    }

    public void setKind(String kind) { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak ve güncellemek için setter metodu kullanarak çağırma yaptık.
        this.kind = kind;
    }

    public int getBirthYear() { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak için getter metodu kullanarak çağırma yaptık.
        return birthYear;
    }

    public void setBirthYear(int birthYear) { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak ve güncellemek için setter metodu kullanarak çağırma yaptık.
        this.birthYear = birthYear;
    }

    public boolean isYirtici() { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak için getter metodu kullanarak çağırma yaptık.
        return yirtici;
    }

    public void setYirtici(boolean yirtici) { // yukarıdaki instance değişkenler private olduğu için, runner class tan bu veriye
        // ulaşmak ve güncellemek için setter metodu kullanarak çağırma yaptık.
        this.yirtici = yirtici;
    }

    public Species getSpc() {
        return spc;
    }

    public void setSpc(Species spc) {
        this.spc = spc;
    }

    @Override
    public String toString() {
        return "Hayvandır Bunlar {" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", birthYear=" + birthYear +
                ", yirtici=" + yirtici +
                ", spc=" + spc +
                '}';
    }
}