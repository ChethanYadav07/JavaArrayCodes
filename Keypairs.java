package com.arraylogical.java;

import java.util.Arrays;

public class Keypairs
{
public static void pairs(int[]a)
{
	int count=0;
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++)
	{
		if(i+1<=a.length-1 && a[i]==a[i+1])
		{
			count++;
			i++;
		}
	}
	System.out.println(count);
}
	public static void main(String[] args)
	{
		int[]a= {1,4,5,1,3,4,1,1,3,5,4,6,5};
		pairs(a);

	}

}
