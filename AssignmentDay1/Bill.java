package AssignmentDay1;

import java.util.Scanner;
public class Bill {
       public static void main(String args[]) {
    	   Scanner input=new Scanner(System.in);
    	   String name=input.next();
    	   int units=input.nextInt();
    	   double ammount;
    	   if(units<=100) {
    		   ammount=units*4;
    	   }else if(units <=300) {
    		   ammount=400+((units-100)*5);
    	   }else {
    		   ammount=400+1000+((units-300)*10);
    	   }
    	   System.out.println("Name : "+name);
    	   System.out.println("units : "+units);
    	   if(ammount<1000) {
    		   System.out.println("Amount : "+ammount);
    	   }else {
    		   ammount=ammount+(ammount*5/100);
    		   ammount=ammount+((ammount*18)/100);
    		   System.out.println("Ammount :"+(ammount));
    	   }
       }
}