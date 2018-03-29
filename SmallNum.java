package task;

import java.util.Scanner;

public class SmallNum 

{
	
public static void main(String[] args)
{
	Scanner s =new Scanner(System.in);

	System.out.println("enter first value");
	int a=s.nextInt();
	
	System.out.println("enter second value");
	int b=s.nextInt();
	System.out.println("enter third value");
	int c=s.nextInt();
	int x=(a<b&&a<c)?a:(b<c)?b:c;
	System.out.println("small num is"+" "+x);
	int y=(a>b&&a>c)?a:(b>c)?b:c;
	System.out.println("large num is"+" "+y);	
}
}
