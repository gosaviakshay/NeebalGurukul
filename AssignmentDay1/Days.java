package AssignmentDay1;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Days=1020;
		int Year=1020/365;
		int Rem=1020%365;
		int Month=Rem/30;
		int Week=Rem%30/7;
		int Rema=Rem%30%7;
		System.out.println( Year+"year"+Month+"month"+Week+"week"+Rema+"Day");

	}

}