package com.arraylogical.java;

import java.util.Scanner;

public class Stringarray 
{
	public static String[] print(String[]s)
	{
		for(int i=0;i<=s.length-1;i++)
		{
			System.out.print(s[i]+" ");
		}
		return s;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String [] num=new String[size];
		System.out.println("enter the String elements");
		for(int i=0;i<=num.length-1;i++)
		{
			num[i]=sc.next();
		}
        print(num);
        sc.close();
	}
}
