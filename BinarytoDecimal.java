package com.arraylogical.java;

public class BintoDec 
{
	public static void convert(int [] num)
	{
		int c=0;
		int sum=0;
		for(int i=num.length-1;i>=0;i--)
		{
			sum=sum+(int)Math.pow(2, c)*num[i];
			c++;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		int[]num= {1,0,0,1,1};
		convert(num);
		int[]num1= {1,1,0,0,1};
		convert(num1);
	}
}
