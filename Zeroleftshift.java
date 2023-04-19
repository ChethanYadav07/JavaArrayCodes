package com.arraylogical.java;

import java.util.Scanner;

public class Zeroleftshift
{
	public static int[] print(int[]num)
	{
		int x=num.length-1;
		int[]arr=new int[num.length];
		for(int i=num.length-1;i>=0;i--)
		{
			if(num[i]!=0)
			{
				arr[x]=num[i];
				x--;
			}
		}
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.print(arr[j]+" ");
		}
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
