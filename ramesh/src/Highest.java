
public class Highest {
	public static void main(String[] args) 
	{
		
		int a[]={5,8,45,68,15,35,5,4};
		int e=a[0];
			for(int i=0;i<=7;i++)
			{
				if(e<a[i])
				{
					e=a[i];
				}			
			}
			System.out.println(e);
		}
}
