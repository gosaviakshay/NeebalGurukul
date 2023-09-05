package neebalgurukulday2;

import java.util.Scanner;

public class Polar {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the values for R1");
		double R,Theta;
		R= sc.nextDouble();
		System.out.println("Enter the values for Theta1");
		Theta= Math.toRadians(sc.nextDouble());
		
		System.out.println("Enter the values for R2");
		double R2,Theta2;
		R2= sc.nextDouble();
		System.out.println("Enter the values for Theta2");
		Theta2= Math.toRadians(sc.nextDouble());
		
		double x1 = R*Math.cos(Theta);
		double y1 = R2*Math.cos(Theta2);
		
		double x2 = R*Math.sin(Theta);
		double y2 = R2*Math.sin(Theta2);
		
		double m=x1+x2;
		double n=y1+y2;
		
		double r3=Math.sqrt(m*m + n*n);
		double q3=Math.atan2(n,m);
		
		q3 = Math.toDegrees(q3);
		
		System.out.println("Polar form is:");
		System.out.println("Magnitude:" +r3);
		System.out.println("Angle in Degrees:" +q3);
		
		
		
	}
}