import java.util.Scanner;
public class Lottery 
{
	public static void main(String[] args) 
	{	
		System.out.println("please enter u r 5 digits lottery number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();	
		int a=12345;
		int p=0,q=0;
		if(n==a)
		{
			System.out.print("congratulations u won 1 lakh rupees lottery");
		}
		else
			if(n!=0)
			{
				    p=n/10;				
					if(p==a/10)
					{
						System.out.print("congratulations u r lottery num first 4 digits matched u won 50000/-");
					}
					else	
						p=p/10;				
						if(p==a/100)
						{
							System.out.print("congratulations u r lottery num first 3 digits matched u won 25000/-");
						}
							else 
								q=n%10000;				
						if(q==a%10000)
							{
								System.out.print("congratulations u r lottery num last 4 digits matched u won 50000/-");
							}
							else	
								q=q%1000;				
									if(q==a%1000)
										{
											System.out.print("congratulations u r lottery num last 3 digits matched u won 25000/-");	
										}
								/*	else
									x=a/10000;
									y=n/10000;								
									m=a%10;
									k=n%10;
									
									if(x!=y)
									{
										System.out.print("congratulations u r lottery num first 3 digits matched u won 25000/-");
									}*/
									else 
												System.out.print("sorry better luck next time");
			}		
	}
}
