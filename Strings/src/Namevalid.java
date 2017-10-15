import java.util.*;


public class Namevalid {
	public static void main(String[] args)
	{
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		char[] c=name.toCharArray();
		int n=0,m=0;
		for(int k=0;k<c.length;k++)
		{	
			if(c[k]=='a' || c[k]=='e' || c[k]=='i' || c[k]=='o' || c[k]=='u')
			{
				n++;
			} else {
				m++;
			}
			
		}
	
		if(n>=0)
		{
			System.out.println("valid name");
		}
		if(m>=0)
		System.out.print("invalid name");
		}
	}

