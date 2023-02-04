package myjava;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of row or columan");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else if(i+j==n-1)
				{
					System.out.print("*");
				}
				else if(i==0&&j<=n-1)
				{
					System.out.print("*");
				}
				else if(i<=n-1&&j==0)
				{
					System.out.print("*");
				}
				else if(i<=n-1&&j==n-1)
				{
					System.out.print("*");
				}
				else if(i==n-1&&j<=n-1)
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
