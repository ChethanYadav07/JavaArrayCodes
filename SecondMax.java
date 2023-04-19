package com.arraylogical.java;

public class SecondMax
{
public static void check(int[]a)
{
	int max=a[0];
	int secondmax=0;
	for(int i=0;i<=a.length-1;i++)
	{
		if(a[i]>max)
		{
			secondmax=max;
			max=a[i];
		}
	}
	System.out.println(secondmax);
}
	public static void main(String[] args)
	{
		int[]a1= {2,4,5,6,7,8,5,4,9,10};
		check(a1);

	}

}
