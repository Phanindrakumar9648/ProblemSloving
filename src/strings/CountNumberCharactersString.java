package strings;

public class CountNumberCharactersString {
    public static void main(String[] args) {

        String s = "Life is not easy @#";
        s=s.replaceAll("[^a-zA-Z]","");
        System.out.println(s.length());
    }
}
