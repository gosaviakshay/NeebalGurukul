package AssignmentDay1;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double x,y,z,r,t;
		System.out.println("Enter");
		x=sc.nextDouble();
		y=sc.nextDouble();
		z=x>y?x:y;
		r=sc.nextDouble();
		t=z>r?z:r;
		System.out.println(t);

	}

}