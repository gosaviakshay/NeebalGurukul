package NeebalgurukulDay2;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int r;
		System.out.println("Enter");
		r= sc.nextInt();
		if ((r&1)==1)
			System.out.println("Odd");
		else System.out.println("Even");
			
	}
}