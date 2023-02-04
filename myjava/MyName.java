package myjava;

import java.util.Scanner;

public class MyName {

	public static void main(String[] args) {
	  System.out.println("Enter number of row or column for My name TARIQUE AZEEZ");
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  for(int i=0;i<=n-1;i++)
	  {
		  //Print T
		  for(int j=0;j<=n-1;j++)
		  {
			  if(i==0&&j<=n-1||i<=n-1&&j==(n-1)/2)
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		         System.out.print(" ");
		         
		         //print A
		         
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
		          System.out.print("");
		          
		          //print R
		          
		  for(int j=0;j<=n-1;j++)
		  {
			  if(i>0&&j==0||i==0&&(j>0&&j<n-1)||(i>0&&i<(n-1)/2)&&j==n-1||i==(n-1)/2&&j<n-1||i-j==(n-1)/2&&j<n-1)
			  {
				  System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		         System.out.print(" ");
		         
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
					
					//print Q
					
					for(int j=0;j<=n-1;j++)
					{
						if((i>1&&i<n-2)&&j==0||i==1&&(j>1&&j<n-3)||i==n-2&&(j>1&&j<n-3)||(i>1&&i<n-2)&&j==n-2 || (i>=(n-1)/2&&j>=(n-1)/2)&&i-j==0)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print(" ");
					//print U
					for(int j=0;j<=n-1;j++)
					{
						if(i<n-1&&j==0||j==n-1&&i<n-1||i==n-1&&(j>0&&j<n-1))
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.print(" ");
					
					//print E 
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
					System.out.print("      ");
					
					//print A
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
					          System.out.print("");
					          
					          //print z
					    for(int j=0;j<=n-1;j++)
					    {
					    	if(i==0&&j<n-1||i==n-1&&j<n-1||i+j==(n+3)/2)
					    	{
					    		System.out.print("*");
					    	}
					    	else
					    	{
					    		System.out.print(" ");
					    	}
					    }
					    System.out.print(" ");
					   //print EE
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
					    System.out.print(" ");
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
					    System.out.print(" ");
					    
					    //print Z
					    for(int j=0;j<=n-1;j++)
					    {
					    	if(i==0&&j<n-1||i==n-1&&j<n-1||i+j==(n+3)/2)
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
