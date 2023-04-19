package com.arraylogical.java;

import java.util.Arrays;
import java.util.Scanner;

public class Evenleftshift 
{
	public static int[] print(int [] num)
	{
	int x=0;
	int[]arr=new int[num.length];
	for(int i=0;i<=num.length-1;i++)
	{
		if(num[i]%2==0)
		{
			arr[x]=num[i];
			x++;
		}
	}
	for(int k=0;k<=num.length-1;k++)
	{
		if(num[k]%2!=0)
		{
			arr[x]=num[k];
			x++;
		}
	}
	
//	for(int j=0;j<=arr.length-1;j++)
//	{
//		System.out.println(arr[j]);
//	}
	System.out.println(Arrays.toString(arr));
	return arr;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int [] num=new int[size];
		System.out.println("enter the int elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.nextInt();
		}
        print(num);
}
}