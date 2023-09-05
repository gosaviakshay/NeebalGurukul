package AssignmentDay1;

import java.util.Scanner;
public class Military {
       public static void main(String args[]) {
    	   Scanner input=new Scanner(System.in);
    	   int x=input.nextInt();
    	   int hour=x/100;
    	   hour=hour%12;
    	   int mins=x%100;
    	   mins =mins%60;
    	   System.out.println(hour+":"+mins);
       }
}