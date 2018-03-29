package ram;

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		System.out.println("enter any num");
		Scanner sc=new Scanner(System.in);
		int	n=sc.nextInt();
		int p=0; 
			for(int j=2;j<n;j++)
			{
				
				if(n%j==0) 
				{
				
					p=1;
					System.out.println("not a prime");
					break;					
				}
			}	
			if(p==0)			
				System.out.println("prime");
	}	
}
