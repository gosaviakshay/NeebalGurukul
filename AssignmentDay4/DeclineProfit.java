package AssignmentDay4;

public class DeclineProfit {

	    public static void main(String[] args) {
		
			int n[] = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
			int a=0;
			for(int i=0;i<n.length-1;i++)
			{
				if(n[i]>n[i+1])
				{
					a=i+2001+1;
					break;
				}
			}
			System.out.println("Decline in profits "+ a);
	}

}
