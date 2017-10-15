
public class addmatrix {

	public static void main(String[] args) {
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]= new int[3][3];
		int s[][]=new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				for(int k=0;k<=2;k++)
					
				{
				
				
				c[i][j]=a[i][k]*b[k][j];
				s[i][j]=s[i][j]+c[i][j];
			
			System.out.print(s[i][j]+" ");
			}
		}}
		System.out.println();
	}
}
