package neebalgurukulday2;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The Number:");
		int a;
		a=sc.nextInt();
		int b=a;
		int sum=0;
				
		for (int i=0;i<=b;i++) 
			sum+=i;
		
		System.out.println(sum);
		
		}
		
			
	
}
