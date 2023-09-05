package AssignmentDay1;

public class Millisec {

	public static void main(String[] args) {
		 int Milli=7000234;
		 int Sec= (Milli/1000)%60;
	   	 int Min=(Milli/1000/60)%60;
	     int Hr=(Milli/1000/60/60);
	     System.out.println(Hr+":"+Min+":"+Sec);

	}

}
