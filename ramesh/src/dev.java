
public class dev {

	/**
	 * @param args
	 */
	public static void main(String[] arg){
		int[] a={1,0,0};
		int n=2;
		int sum=0;
		for(int i=0;i<=2;i++)
		{
			sum=(2^n*a[i])+sum;
			n--;
		
		}
		System.out.print(sum);
		
	}
}
	
