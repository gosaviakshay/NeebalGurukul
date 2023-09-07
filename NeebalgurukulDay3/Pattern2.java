package NeebalgurukulDay3;

public class Pattern2 {

	public static void main(String[] args) {
		int s=1;
		
		for (int i=1;i<=5;i++) 
		{
			for (int j=1;j<=5-i;j++) 
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
			for(int j=1;j<=5;j++) {
				if(i==5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (int k=4;k>=1;--k) {
			
			for (int j=1;j<=5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=k;j++) {
				System.out.print("*");
			}
			
			
			System.out.println();
		} 
			
			
	}
}
