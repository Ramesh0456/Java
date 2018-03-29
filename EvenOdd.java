package task;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	System.out.println("enter a num");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.print("Odd numbers between 0 to"+" "+n+" "+"is :");
	for(int i=1;i<=n;i=i+2)		{
		System.out.print(" "+i);
	}	
	System.out.println();
	System.out.print("Even numbers between 0 to"+" "+n+" "+"is :");
	for(int i=0;i<=n;i=i+2)		
	{
		System.out.print(" "+i);	
	}	
	}

}

