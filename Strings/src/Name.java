import java.util.*;
public class Name {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter your name");
	Scanner s=new Scanner(System.in);
	String name=s.next();
	System.out.println(name);
	String lc=name.toLowerCase();
	System.out.println("your name i lower case"+" "+lc);
	String ss=name.toUpperCase();
	System.out.println("your name in upper case"+" "+ss);
	//char[] a=ss.toCharArray();
	StringBuffer ob=new StringBuffer(name);
	StringBuffer d=ob.reverse();
	System.out.println("your name in reverse"+" "+d);
	//char a=name.charAt(0);
	String  x= String.valueOf(name.charAt(0));
	 String y=x.toUpperCase();
	 //String k=y.toCharArray();
	// System.out.println(y);
	// if(a==name.charAt(0))
	 //{
	 String z=name.replace(x,y);
	 System.out.println(z);
	 //}
	 
	 
	 
	 /*String[] n=name.split("-");
	 for(int i=0;i<=n.length;i++)
	 {
	 System.out.println(n[i]);
	 
	}*/}}