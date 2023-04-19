package com.arraylogical.java;

public class printprime 
{
	public static void print(int[]num)
	{
		int count=0;
		for(int i=1;i<=num.length-1;i++)
		{
			for(int j=2;j<=num[i];j++)
			{
			if(i%j==0)
			{
				count++;
			}
			}
			if(count==0)
			{
				System.out.println(num[i]);
			}
		}
		
	}
		public static void main(String[] args) 
		{
			int []num= {2,5,3,7,5,11};
			print(num);
		}
}
