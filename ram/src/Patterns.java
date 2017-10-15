
public class Patterns 
{
	//int n=0;
	void printStars()
	{
		for(int i=0;i<=4;i++)
		{

			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");		
			}
			System.out.println();
		}
	}
	void printNumbers(int n)
	{
		for(int i=0;i<=4;i++)
		{

			for(int j=0;j<=i;j++)
			{
				System.out.print(n+"  ");
				n++;
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) 
	{
		Patterns ob=new Patterns();
		ob.printStars();
		ob.printNumbers(0);
			}

}
