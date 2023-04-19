package com.arraylogical.java;

public class TwoArraysEqual 
{
public static boolean check(int[]num1,int[]num2)
{
	int count=0;
	if(num1.length==num2.length)
	{
		for(int i=0;i<=num1.length-1;i++)
		{
			for(int j=0;j<=num2.length-1;j++)
			{
				if(num1[i]==num2[j])
				{
					count++;
				}
			}
		}
	}
	if(num1.length==count)
	{
		return true;
	}
	return false;
}
	public static void main(String[] args) 
	{
		int[]num1= {1,2,3,4,5};
		int[]num2= {3,5,2,4,1};
		System.out.println(check(num1,num2));

	}

}
