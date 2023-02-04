package myjava;

import java.util.Scanner;

public class Alphabets {
	public static void main(String args[])
	{
		System.out.println("Enter a number of row or column");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//code for A
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if((i==0&&j>0)&&j<(n-1)/2||i>0&&j==0||j==(n-1)/2&&i>0||i==(n-1)/2&&j<=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	System.out.println();
		//code for B
	for(int i=0;i<=n-1;i++)
	{
		for(int j=0;j<=n-1;j++)
		{
			if(i<=n-1&&j==0||i==0&&j<n-1||i==(n-1)/2&&j<n-1||i==n-1&&j<n-1||(i<(n-1)/2&&i>0)&&j==n-1||(i>(n-1)/2&&i<n-1)&&j==n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
		//code for C
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j>0||(i>0&&i<n-1)&&j==0||i==n-1&&j>0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//code for D
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i==0&&j<n-1||i==n-1&&j<n-1||(i>0&&i<n-1)&&j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//code for E
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j<=n-1||i<=n-1&&j==0||i==n-1&&j<=n-1||i==(n-1)/2&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//code for F
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j<=n-1||i<=n-1&&j==0||i==(n-1)/2&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//code for G
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j>0||(i>0&&i<n-1)&&j==0||i==n-1&&j>0||i>=(n-1)/2&&j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//code for H
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i<=n-1&&j==n-1||i==(n-1)/2&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

