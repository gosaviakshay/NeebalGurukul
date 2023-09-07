package NeebalgurukulDay3;

public class WhileAdd {

	public static void main(String[] args) {
		
		int x=2457;
		int count=0;
		while(x!=0) {
			count=count+x%10;
			x=x/10;
		}System.out.println(count); 
			

	}

}
