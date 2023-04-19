package com.arraylogical.java;

import java.util.Scanner;

public class FrequencyLInearsearch 
{
	public static int shift(int[]num,int key)
	{
			int count=0;
			for(int j=0;j<=num.length-1;j++)
			{
				if(num[j]==key)
				{
					count++;
				}
			}
		return count;
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
		System.out.println("enter the key");
		int key=sc.nextInt();
        System.out.println(shift(num,key));

	}
}
