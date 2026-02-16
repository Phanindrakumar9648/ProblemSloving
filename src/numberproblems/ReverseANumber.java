package numberproblems;

public class ReverseANumber {
    public static void main(String[] args) {

        int num = 123;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;      // get last digit
            rev = rev * 10 + digit;    // shift left and add digit
            num = num / 10;            // remove last digit
        }

        System.out.println(rev);
    }

}
