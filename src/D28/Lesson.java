package D28;

public class Lesson {

    String name;
    int credit;

    public Lesson(String name, int credit) {
        this.name = name;
        if(credit<=10 && credit>=10) this.credit = credit;
        else this.credit = 5;
    }
}
