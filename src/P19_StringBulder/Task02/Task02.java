package P19_StringBulder.Task02;

public class Task02 {
    public static void main(String[] args) {


    // String bulderda harfleri büyük yapın

    StringBuilder sb =new StringBuilder();
    sb.append("Sibel");
    sb.replace(0,sb.length(),sb.toString().toUpperCase()); //yer degistirmek replace
    System.out.println(sb);





}
}
