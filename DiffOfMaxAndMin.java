package com.arraylogical.java;

public class Diffmaxandmin 
{
	public static void print(int[]num)
	{
		int max=num[0];
		int min=num[0];
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>max)
			{
			max=num[i];
			}
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		int c=max-min;
		System.out.println(c);
	}
		public static void main(String[] args) 
		{
			int []num= {2,4,6,9,4,5,8};
			print(num);
		}
}
