package AssignmentDay4;

import java.util.Scanner;

public class Findindexofsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int small=0;
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i=1;i<n;i++) {
        	if (arr[i]<arr[small]) {
        		small=i;
        	}
        }System.out.println(small);
    }
}
