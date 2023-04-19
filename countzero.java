package com.arraylogical.java;

public class countzero 
{
	public static void print(int[]num)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,8,0,0,4,5,8,0};
			print(num);
		}
}
