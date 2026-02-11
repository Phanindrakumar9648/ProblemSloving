package strings;

public class ReverseAString {
    public static void main(String[] args) {

        String s = "Phani";
        String srev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            srev = srev + s.charAt(i);
        }
        System.out.println(srev);
    }
}
