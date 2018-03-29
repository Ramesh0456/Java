package Array;

public class AddMatrix 
{
public static void main(String[] args) 
	{
		int [][]a= {{1,8,7},{4,2,5},{2,7,8}}; 
		int [][]b= {{2,4,8},{2,5,2},{5,6,1}};
		for(int i=0;i<=2;i++) 
		{
			int count;
			for(int j=0;j<=2;j++) 
			{
				System.out.print(a[i][j]+b[i][j]+"   ");
			}		
		System.out.println();
		}	
	}
}