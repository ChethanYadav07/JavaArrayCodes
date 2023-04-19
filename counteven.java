package com.arraylogical.java;

public class counteven 
{
	public static void print(int[]num)
	{
		int count=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]!=0 && num[i]%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,8,4,5,8,0};
			print(num);
		}
}
