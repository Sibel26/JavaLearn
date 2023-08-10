package P19_StringBulder.Task02;

public class Task03 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        sb1.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb1); // B )// ekrana ne yazar

        //abbaa
        //abbaccca

    }
}
