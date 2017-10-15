import java.util.*;


public class vowels {
	public static void main(String[] args) {
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		char[] c=name.toCharArray();
		int t=0,l=0,n=0;
		for(int k=0;k<c.length;k++)
		{	
			if(c[k]=='a' || c[k]=='e' || c[k]=='i' || c[k]=='o' || c[k]=='u')
			{
				n=++l;	
			}else				
			t++;
		}		//n++;
		System.out.println("number of vowels"+" "+n);
		System.out.print("number of consonents"+" "+t);
		
	}

}
