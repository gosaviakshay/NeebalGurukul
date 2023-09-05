//Input the lower bound and upper bound then print all the Fibonacci numbers within the
//bound
package NeebalgurukulDay2;

import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int lowerBound = sc.nextInt();

        System.out.print("Enter the second number: ");
        int upperBound = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci numbers within the range: ");
        for (int i = a; i <= upperBound; ) {
            if (i >= lowerBound) {
                System.out.print(i + " ");
            }
            int next = a + b;
            a = b;
            b = next;
            i = a;
    }}
}