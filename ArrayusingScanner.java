package com.arraylogical.java;

import java.util.Scanner;

public class ArrayusingScanner
{
public static int[] print(int[] num)
{
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
        print(num);
	}

}
