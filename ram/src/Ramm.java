import java.util.*;
public class Ramm {

	public static void main(String[] args) {
		int opt=0;
		//int p=0,c=0;
		while(opt!=4)
		{
		System.out.println("enter u r choice");
		System.out.println("1 paper");
		System.out.println("2 seosar");
		System.out.println("3 rock");
		System.out.println("4 exit");
		Scanner obp=new Scanner(System.in);
		opt=obp.nextInt();
		Random obj=new Random();
		int n=obj.nextInt(3)+1;
		switch(opt)
		{
		case 1:
		{
			if(n==1)
			{
				System.out.println("try agian");
			}
			else if(n==2)
			{
				System.out.println("paper wins");
			//c++;
		}
		else 
		{
			System.out.println("rock wins");
			//p++;
		} break;
		}
		case 2:
		{
			if(n==2)
			{
				System.out.println("try agian");
			}
			else if(n==1)
			{
				System.out.println("paper wins");
		//	c++;
		}
		else 
		{
			System.out.println("seoser wins");
			//p++;
		} break;
		}
		case 3:
		{
			if(n==3)
			{
				System.out.println("try agian");
			}
			else if(n==2)
			{
				System.out.println("seoser wins");
			//c++;
		}
		else 
		{
			System.out.println("rock wins");
			//p++;
		} break;
		}
	}
		if(opt==4)
			System.out.println("game ends");
		}
		}
	}
			

