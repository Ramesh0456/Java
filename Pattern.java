public class Pattern 
{
	//int n=0;
	void printStar()
	{
		for(int i=1;i<=4;i++)
		{

			for(int j=i-1;j<=i;j++)
			{
				System.out.print("*"+" ");		
			}
	//		System.out.println();
			}
	}
		public static void main(String[] args) 
		{
			Patterns ob=new Patterns();
			ob.printStars();
				}
} 