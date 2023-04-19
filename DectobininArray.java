package com.arraylogical.java;

import java.util.Scanner;

public class DectobininArray 
{
public static String[] convert(int[]a)
{
	String []res=new String[a.length];
	String s=" ";
	for(int i=0;i<=a.length-1;i++)
	{
		while(a[i]>0)
		{
			int rem=a[i]%2;
			s=rem+s;
			a[i]=a[i]/2;	
		}
		res[i]=s;
	}
	for(int k=0;k<=res.length-1;k++)
	{
		System.out.println(res[k]+" ");
	}
	return res;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[]b=new int[size];
        for(int i=0;i<=b.length-1;i++)
        {
        	b[i]=sc.nextInt();
        }
        convert(b);

	}

}
