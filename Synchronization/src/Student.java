//import java.lang.*;

public class Student extends Thread 
{
	public synchronized void run()
	{	
	String[] s={"3","9","abcd","efgh","10","6","5"};
	int sum=0;	
		for(int i=0;i<s.length;i++)
			{
			try{
				sum=sum+Integer.parseInt(s[i]);
				//System.out.println(Integer.parseInt(s[i]));
				}catch(NumberFormatException  e){
					System.out.println("r"
							);
				}
			}
	System.out.print(sum);	
	}		
}