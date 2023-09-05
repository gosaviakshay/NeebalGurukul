package AssignmentDay2;

import java.util.Scanner;

public class Cosineseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		double sum=1;
		double n=Math.toRadians(a);
		int fact=1;
		double num=1;
		for(int i=1;i<=19;i++)
		{
			fact=fact*i;//factorial with each iteration
			if(i%2==0)
			{
				num=-num*n*n;//updating num with each iteration
				sum=sum+num/fact;//find sum with each iteration
			}
			
			
		}
		System.out.println("Answer = "+sum);//Here we get answer
		
		
		sc.close(); 

	}

}