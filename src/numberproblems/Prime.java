package numberproblems;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("Entered number:" + num);

        if (num <= 1) {
            System.out.println("Not an Prime number");
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
