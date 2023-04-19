package com.arraylogical.java;

public class Removeduplicatesoncedisplay
{
	public static void print(int []num)
	{
		for(int i=0;i<=num.length-1;i++)
		{
			int count=0;
			for(int j=i+1;j<=num.length-1;j++)
			{
				if(num[i]==num[j])
				{
					count++;
				}
			}
			if(count<1)
			{
				System.out.print(num[i]+" ");
			}
		}
	}
		public static void main(String[] args) 
		{
//			int[] num= {1,3,4,3,1,4,6,7,8};
//			int[] num= {1,5,4,2,1,3,7,3,2,1};
//			print(num);
			int[] num1= {1,8,3,4,5,10,5,5,5,6,7,9,10,7,7,2};
			print(num1);

		}
}
