package com.arraylogical.java;

public class sumofelements 
{
	public static void print(int[]num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,8,4,5,8};
			print(num);
		}
}
