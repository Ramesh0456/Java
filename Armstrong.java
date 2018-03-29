package task;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args)
	{
		System.out.println("enter a num");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k,m=0,l=n;
			while(n>0)
			{
				k=n%10;
				n=n/10;
				m=m+(k*k*k);
			}
				if(l==m)
				{
				System.out.println("armstrong");
		
				}else
					System.out.println("not armstrong");
	}
}
