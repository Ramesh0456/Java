
public class Matrix {
	public static double es(int [][]a)
	{
		double avg=0;
		int sum=0,n=a.length;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length+1;j++)
		{
		sum=sum+a[i][j];
		 avg=sum/n;
		}
	}
		return avg;
	}
	public static void main(String[] args) {
	int [][]a={{2,9,9},{5,5,7}};
		double y=es(a);
		System.out.print(y);
		}
}
