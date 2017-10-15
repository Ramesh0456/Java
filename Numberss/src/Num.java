
import java.util.*;
public class Num 
{	
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int p=n;
		char[][] a={{'z','e','r','o'},{'o','n','e'},{'t','w','o'},{'t','h','r','e','e'},{'f','o','u','r'},{'f','i','v','e'},{'s','i','x'},{'s','e','v','e','n'},{'e','i','g','h','t'},{'n','i','n','e'}};
		//System.out.println(a[0].length);
		int temp=0;
		while(n!=0)
		{
			p=n%10;
			temp=temp+a[p].length;
			n=n/10;
			}
		System.out.println(temp);
		}
	}
