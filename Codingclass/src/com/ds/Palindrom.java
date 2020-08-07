package com.ds;

import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("enter the number");
			int n=sc.nextInt();
			int k=n;
			//i take while loop
		  int i,r=0;
			while(n>0)
			{
				//devide by vaule  123/10 reminder 3
				i=n%10;
				// excuation line is 3
				r=r*10+i;
				// excuation line is 12
				n=n/10;
			}
			if(k==r)
			{
				 System.out.println(" is Palindrom Number ..");
		}
			else
			{
				 System.out.println(" not Palindrom number ..");
			}
		}
	}
}
