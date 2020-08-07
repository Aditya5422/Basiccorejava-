package com.ds;

import java.util.ArrayList;

public class Prime {

	/*
	 * public static void main(String[] args) { try (Scanner sc = new
	 * Scanner(System.in);) { System.out.println("enter the number"); int n =
	 * sc.nextInt(); int count = 0; xyz: for (int i = 1; i <= n; i++) { if (n % i ==
	 * 0) { count++; if(count==3) { break xyz; } } } if (count == 2) {
	 * System.out.println("prime numberis..."); } else {
	 * System.out.println("not prime numberis..."); } } }
	 */
public static void main(String[] args)

{

int number_given=-999, number_show=0;


		int item[] =null;

		 ArrayList<Integer>list=new  ArrayList<Integer>();



		while(number_given!=0)
{



			number_show=number_given%1000;
          int n1=0;
		list.add(n1);

			number_given/=1000;

}

list.add(0,5);

for(Integer i:list) {
System.out.print(i);
}


		}
	
}