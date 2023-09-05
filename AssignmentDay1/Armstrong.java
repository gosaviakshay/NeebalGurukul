package AssignmentDay1;

import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int value,d3,d2,d1;
		System.out.println("Enter");
		value=sc.nextInt();
		d1=value%10;
		d2=value/10%10;
		d3=value/10/10;
		if(value==d3*d3*d3+d2*d2*d2+d1*d1*d1)
        System.out.println("value is Armstrong number");
		else
			 System.out.println("value is not Armstrong number");	
	}

}