package numberproblems;

public class NthFibonacciNumber {

    public static void main(String[] args) {

        int n = 7;

        int first = 0;
        int second = 1;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(second);
    }
}

