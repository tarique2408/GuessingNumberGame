package myjava;

import java.util.Scanner;

public class Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//print space
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			//print star
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
