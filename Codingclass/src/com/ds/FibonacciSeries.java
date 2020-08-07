package com.ds;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("enter the number");
			int n=sc.nextInt();
			int i=0,j=1,s=0;
			for(int k=1;k<=n;k++)
			{
				System.out.println(s +"");
				i=j;
				j=s;
				s=i+j;
			}
		}

	}

}
