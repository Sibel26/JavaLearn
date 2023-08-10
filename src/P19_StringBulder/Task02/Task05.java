package P19_StringBulder.Task02;

public class Task05 {
    public static void main(String[] args) {
        // verilen string polidrom mudur kontrol ediniz

        String str = "java bir program dilidir.";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str.equals(sb.reverse().toString())) System.out.println("polidromdur.");
        else System.out.println("polidrom değildir");








    }

}
