package com.arraylogical.java;

import java.util.Scanner;

public class Rotateleft
{
	public static int[] shift(int[]num)
	{
			int first=num[0];
			for(int j=0;j<=num.length-1;j++)
			{
				if(j+1<=num.length-1)
				{
					num[j]=num[j+1];
				}
			}
			num[num.length-1]=first;
		
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
