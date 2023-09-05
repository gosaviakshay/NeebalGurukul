//Print first 10 even fibonacii numbers

package AssignmentDay2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number :");
		int a=sc.nextInt();
		int FN=0;
		int SN=1;
		int count = 0;
		for(int i=1;count<a;i++) {

			  int NN=FN+SN;
			  FN=SN;
			  SN=NN;
			  
			  if(NN%2==0) {
				  System.out.print (" "+NN);
				  count++;
			  
			  
			  
			  
			  
			
			
			  }
		}
		
		

	}

}