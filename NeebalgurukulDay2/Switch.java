package NeebalgurukulDay2;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter");
		String n;
		n= sc.nextLine();
		switch(n)
		{
		case "Square":
			Scanner ok=new Scanner (System.in);
			System.out.println("Enter");
			int a;
			a= ok.nextInt();
			int b=a*2;
			System.out.println(b);
			break;
			
		case "Circle":
			Scanner dk=new Scanner (System.in);
			System.out.println("Enter");
			double q;
			q= dk.nextInt();
			double c=(3.14*q)*2;
			System.out.println(c);
			break;	
			
		case "Rectangle":
			Scanner no=new Scanner (System.in);
			System.out.println("Enter");
			int L;
			int B;
			L= no.nextInt();
			B= no.nextInt();
			int h=L*B;
			System.out.println(h);
			break;	
			
			
			
			
		
		}
		
		
    }
}