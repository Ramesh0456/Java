
public class matrixsum {

	
	public static void main(String[] args) {
		int[][]a={{1,3,5},{2,6,8},{4,9,6}};
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
			a[i][j]=a[i][j]*a[i][j];
			System.out.print(a[i][j]+"  ");
		
		}
           System.out.println();
	}

}
}