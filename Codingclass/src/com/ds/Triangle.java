package com.ds;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
      for(int i=1;i<=5;i++)
			{
	for(int s=i;s<=5;s++)
	{
		System.out.println(" ");
	}//innerloop
				for(int j=1;j<=i;j++)
				{
					System.out.println(j+"");
				}//innerloop
				for(int k=i-1;k>=1;k--) {
					System.out.println(k+"");
				}//innerloop
				System.out.println("\n");
			}//outerloop
			
		}
	}