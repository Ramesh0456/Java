import java.util.*;
public class Random {
   public static void main(String[] args) {
	int i=0;
	   while(i<=10)	{
		Random obj=new Random();
		int n=obj.nextInt(2);
		if(n==1)
		{
			System.out.println("heads");
		}
		else

			System.out.println("tails");
		i++;
	}
	}

private int nextInt(int i) {
	// TODO Auto-generated method stub
	return 0;
}

}
