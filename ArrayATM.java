

//Reach the Given Amount By minimun Number Of Notes



package com.arraylogical.java;

public class ArrayATM
{
public static void atm(int []num,int key)
{
	int count=0;
	for(int i=0;i<=num.length-1;i++)
	{
		 int rem=key/num[i];
		 count=count+rem;
		 key=key%num[i];
	}
	System.out.println(count);
}
	public static void main(String[] args) 
	{
		int []num= {2000,1000,500,100,50,10};
		int key=10000;
		atm(num,key);

	}

}
