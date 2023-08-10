package P19_StringBulder.Task02;

public class Task05ikincicozum {
    public static void main(String[] args) {

        String str = "ali ilA";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(str);
        System.out.println(sb);

if(sb.toString().equals(str)) System.out.println("polidromdur");
else System.out.println("polidrom degildir");

    }


}
