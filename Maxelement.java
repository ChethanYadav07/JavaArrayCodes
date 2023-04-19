package com.arraylogical.java;

public class Maxelement 
{
	public static void print(int[]num)
	{
		int max=num[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>max)
			{
			max=num[i];
			}
		}
		System.out.println(max);
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,9,4,50,8};
			print(num);
		}
}
