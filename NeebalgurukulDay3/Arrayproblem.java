package NeebalgurukulDay3;

import java.util.Scanner;

public class Arrayproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter The Length of array");
		int n=sc.nextInt();
		double sum=0,avg,variance,std,temp=0;
		double arr[]=new double[n];
		
		System.out.println("Enter values of arrays");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
			}
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/n;
		
		for(int i=0;i<arr.length;i++) {
			temp+=Math.pow((arr[i]-avg),2);
		}
		variance = temp/n;
		std=Math.sqrt(variance);
		
		
		System.out.println("sum:"+sum);
		System.out.println("Avg:"+avg);
		System.out.println("Variance:"+variance);
		System.out.println("std:"+std);
	}

}
