package com.arraylogical.java;

public class printsecondhalf
{
	public static void print(int[]num)
	{
		for(int i=(num.length-1)/2;i<=num.length-1;i++)
		{
			System.out.println(num[i]);
		}
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,8,4,5,8};
			print(num);
		}
}
