package com.arraylogical.java;

import java.util.Scanner;

public class BubbleSort
{
public static int[] bubblesort(int []a)
{
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=0;j<=a.length-1;j++)
		{
			if(j+1<=a.length-1 && a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(int k=0;k<=a.length-1;k++)
	{
		System.out.print(a[k]+" ");
	}
	return a;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]a=new int[size];
        for(int i=0;i<=a.length-1;i++)
        {
        	a[i]=sc.nextInt();
        }
        bubblesort(a);
	}

}
