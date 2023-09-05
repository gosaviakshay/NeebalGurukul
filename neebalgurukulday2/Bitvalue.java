package neebalgurukulday2;

import java.util.Scanner;

public class Bitvalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter");
		int n;
		n= sc.nextInt();
		int b;
		b= sc.nextInt();
		int x =((n>>(b-1))&1);
		System.out.println(x);
	}

}
