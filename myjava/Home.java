package myjava;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		System.out.println("Enter number of row or column");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0&&j<=n-1||i<=n-1&&j==0||i<=n-1&&j==n-1||i==n-1&&j<=n-1||i+j<=(n-1)/2||j-i>=(n-1)/2)
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
