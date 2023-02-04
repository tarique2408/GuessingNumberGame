package myjava;

import java.util.Scanner;

public class PwSkills {

	public static void main(String[] args) {
		System.out.println("Enter number of row or column");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			//print P
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j<n-1||i<=n-1&&j==0||i==(n-1)/2&&j<n-1||j==n-1&&(i>0&&i<(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//print W
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i<=n-1&&j==n-1||i+j==(n+3)/2&&(i>=(n-1)/2&&j<=(n-1)/2)||i-j==0&&(i>=(n-1)/2&&j>=(n-1)/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("      ");//6 space 
			//print S
			for(int j=0;j<=n-1;j++)
			{
				if((i>0&&j==0)&&i<(n-1)/2||i==0&&j<=n-1||i==(n-1)/2&&j<n-1||i>=(n-1)/2&&j==n-1||i==n-1&&j>=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//print K
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i+j==(n-1)/2||i-j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("");
			//print I
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j<=n-1||i<=n-1&&j==(n-1)/2||i==n-1&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.print(" ");
			//print L
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i==n-1&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//print L
			for(int j=0;j<=n-1;j++)
			{
				if(i<=n-1&&j==0||i==n-1&&j<=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			//print S
			for(int j=0;j<=n-1;j++)
			{
				if((i>0&&j==0)&&i<(n-1)/2||i==0&&j<=n-1||i==(n-1)/2&&j<n-1||i>=(n-1)/2&&j==n-1||i==n-1&&j>=0)
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
