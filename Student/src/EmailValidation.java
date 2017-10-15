import java.util.*;
public class EmailValidation {
	
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the email id");
	String a=s.next();
	char[] c=a.toCharArray();	  
	 boolean valid1=valid(c);
	  boolean valid2=validation(c);
	  if(valid2==true&&valid1==true)
	  {
		 String []b=a.split("@");
		  String []s1=b[1].split("\\.");	
		  int count3=b[0].length();		  
		  int count1=s1[0].length();		  
		  int count2=s1[1].length();
		  if(count3>=2&&count1>3&&count2>2)
		  {
			  System.out.println("the email is valid");
		  }
		  else
		  {
			  System.out.println("invalid email id");
		  }		  
	  }
	  else
	  {
		  System.out.println("please check the parameters that passed");
	  }	  
	 }	
public static boolean	valid(char[] c)
{ 
	boolean value = false;
	int count=0;
	for(int j=0;j<c.length;j++)
	{
		if(c[j]=='@')
		{
			count++;
		}	
	} 
	if(count==1)
		{
	value=true;
		}
	return value;
}
public static boolean validation(char[] c){
	 char [] operations={'+','-','*','/','=','!','$','%','^','&','-','(',')','~'};
	 boolean value=false;
	int count4=0;
	    for(int i=0;i<operations.length;i++)
	    {
	    	for(int j=0;j<c.length;j++)
	    	{
	    	if(c[j]==operations[i])
	    	{
	        count4++;	
	        	
	       }
	        	}	    		
	    }
	    if(count4==0)
	    {
	     value=true;
	    }
		return value;	 
}
}