package com.arraylogical.java;

import java.util.Scanner;

public class RotateRight 
{
	public static int[] shift(int[]num)
	{
			int last=num[num.length-1];
			for(int j=num.length-1;j>=0;j--)
			{
				if(j-1>=0)
				{
					num[j]=num[j-1];
				}
			}
			num[0]=last;
		
		for(int i=0;i<=num.length-1;i++)
		{
			System.out.println(num[i]+" ");
		}
		return num;
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
        shift(num);

	}
}
