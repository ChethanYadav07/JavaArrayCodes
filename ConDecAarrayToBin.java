package com.arraylogical.java;

import java.util.Arrays;

public class ConDecAarrayToBin
{
	public static String convert(int num)
	{
		String res="";
		while(num>0)
		{
			int rem=num%2;
			res=rem+res;
			num=num/2;
		}
		return res;
	}
	public static String[] abs(int[] n1)
	{
		String[] str=new String[n1.length];
		for(int i=0;i<=n1.length-1;i++)
		{
			String s=convert(n1[i]);
			str[i]=s;
		}
		System.out.println(Arrays.toString(str));
		return str;
		
	}

	public static void main(String[] args) 
	{
		int[] ss= {5,4,1,13};
		abs(ss);
	}

}
