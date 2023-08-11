package P20_Constractor.Exemples02;

public class Pats {
    int patId;
    String patName;
    String patSpecies;

    public Pats() {
    }

    public Pats(int patId, String patName, String patSpecies) {
        this.patId = patId;
        this.patName = patName;
        this.patSpecies = patSpecies;
    }

    public void voice(String patName){
        switch (patName) {
            case "bird" :System.out.println("cik cik");break;
            case "cat" :System.out.println("miav");break;
            case "dog" :System.out.println("hav hav");break;
        }
    }
    public static void voice2(String patName){
        switch (patName) {
            case "bird" :System.out.println("cik cik");break;
            case "cat" :System.out.println("miav");break;
            case "dog" :System.out.println("hav hav");break;
        }
    }

    @Override
    public String toString() {
        return "Pats{" + "ID ='" + patId + '\'' +
                ", Name=" + patName +
                ", Cins=" + patSpecies +
                '}';
    }

}
