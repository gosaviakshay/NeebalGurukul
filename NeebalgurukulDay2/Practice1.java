package NeebalgurukulDay2;

import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No.:");
		int a=sc.nextInt();
		int sum=0;
		for (int i=1;i<=a;i++) 
			sum+=i;
		
		System.out.println("Sum of Number is:"+ sum);
		
			
	}

}
