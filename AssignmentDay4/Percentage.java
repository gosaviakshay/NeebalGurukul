package AssignmentDay4;

public class Percentage {

	public static void main(String[] args) {
		
		int arr[]= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		int sum=0;
		int totaldays=arr.length;
		for (int i=0;i<totaldays;i++) {
			if(arr[i]==1) {
				sum++;
			}
		}
		double per=(double)sum/(double)totaldays*100;
		System.out.println("Attedance Percentage:"+per);
		
	}
}