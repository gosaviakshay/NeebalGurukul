package NeebalgurukulDay3;

public class Pyramidpattern {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++)
				System.out.print(" ");
			
			for (int j=1;j<=i;j++)
				System.out.print(j);
			
			for (int j=i-1;j>=1;j--)
				System.out.print(j);
			
			System.out.println();
		}	
			for(int i=4;i>0;i--) {
				for(int j=i;j<=5;j++)
					System.out.print(" ");
				
				for (int j=1;j<=i;j++)
					System.out.print(j);
				
				for (int j=i-1;j>=1;j--)
					System.out.print(j);
				
				System.out.println();
					
				
				
					
				
			
			
			
			
		}
			
		// TODO Auto-generated method stub

	}

}
