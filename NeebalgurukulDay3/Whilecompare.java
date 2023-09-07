package NeebalgurukulDay3;

public class Whilecompare {

	public static void main(String[] args) {
		
		
		int a= 34572;
		
		int large=0;
		
		while(a!=0) {
			
			int box= a%10;
			
			if(large<box) {
				large=box;
			}
			a=a/10;					
		}
		System.out.println(large);
		
	}

}
