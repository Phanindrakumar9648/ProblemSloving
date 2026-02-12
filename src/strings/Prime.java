package strings;


//A prime number is a natural number greater than 1 that is divisible only by 1 and itself.
public class Prime {
    public static void main(String[] args) {

        int num = 17;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % 1 == 0) {
                    isPrime = true;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
