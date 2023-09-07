package NeebalgurukulDay3;

public class Numtoword {

	public static void main(String[] args) {
		
		int a=14543;
		String ans="";
		
		while(a!=0) {
			
			int ch=a%10;
			a=a/10;
			
			switch(ch) {
			
			case 0:
				ans ="zero "+ans;
				break;
			
			case 1:
				ans ="one "+ans;
				break;
				
			case 2:
				ans ="two "+ans;
				break;
				
			case 3:
				ans ="three "+ans;
				break;
				
			case 4:
				ans ="four "+ans;
				break;
				
			case 5:
				ans ="five "+ans;
				break;	
				
			case 6:
				ans ="six "+ans;
				break;
				
			case 7:
				ans ="seven "+ans;
				break;
				
			case 8:
				ans ="eight "+ans;
				break;	
				
			case 9:
				ans ="nine"+ans;
				break;	
			}
		}
		System.out.print(""+ans);
		
		
			
				

	}

}
