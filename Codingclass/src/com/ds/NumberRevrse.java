package com.ds;

import java.util.Scanner;

public class NumberRevrse {

	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in);){
		System.out.println("Enter the Number");
		int n=s.nextInt();
		  int i,r=0;
		//i take while loop
		while(n>0){
			//devide by vaule  123/10 reminder 3
			i= n%10;
			// excuation line is 3
			r= r*10+i;
			// excuation line is 12
			n= n/10;
		}
      System.out.println("The reverse of given number is : "+r);
	}
	}
}