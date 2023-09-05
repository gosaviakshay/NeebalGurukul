package neebalgurukulday2;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The Number");
		int a=sc.nextInt();
	    
		System.out.println("The Table Of:"+a);
		for (int i=1;i<=10;i++)
			System.out.println(a+"x"+i+"="+(a*i));
		
		
		
	}

}
