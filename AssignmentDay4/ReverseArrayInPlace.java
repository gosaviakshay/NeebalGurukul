package AssignmentDay4;

import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
        }
           
        System.out.println("Reversed Array:");
           for(int j=arr.length-1;j>=0;j--) {
		System.out.print(" "+arr[j]);
           } 
    }
}