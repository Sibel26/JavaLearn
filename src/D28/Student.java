package D28;

import java.util.ArrayList;

public class Student {
    String name ;
    int maxCredit ;
    ArrayList<Lesson> list;

    public Student(String name, int maxCredit, ArrayList<Lesson>list) {
        this.name = name;
        this.maxCredit=maxCredit;
        this.list = list;

    }

    public int toplamKredi () {
        int toplamKredi = 0;
        for (Lesson ders: list) {
            toplamKredi += ders.credit;
        }
        return toplamKredi;




    }






}
