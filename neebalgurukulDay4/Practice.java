package neebalgurukulDay4;

public class Practice {

	public static void main(String[] args) {
		
		int arr[]= {15,8,17,12,4,3};
	    
		for(int i=0;i<arr.length-1;i++) {
			int m = i;
			for(int j=m+1;j<arr.length;j++) {
				
				if (arr[m]>arr[j]) {
					m=j;
				}
			}
			int t=arr[i];
			arr[i]=arr[m];
			arr[m]=t;
				}for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
