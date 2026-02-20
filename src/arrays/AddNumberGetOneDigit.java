package arrays;

public class AddNumberGetOneDigit {

    public static void main(String[] args) {


        int num = 12345;

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                int sep = num % 10;
                sum = sum + sep;
                num = num / 10;
            }
            num = sum;
        }
        System.out.println(num);
    }
}

