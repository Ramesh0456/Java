
public class Cv {
	int sno;
	int age;
	String sName;
	Cv(int a,int b,String c)
	{
		sno=a;
		age=b;
		sName=c;
	}
	
	void details()
	{
	System.out.println("Student name"+" "+sName);
	System.out.println("Student num"+" "+sno);
	System.out.println("Student age is"+" "+ age);
	
	}
	public static void main(String[] args) 
	{
		String s1="sneha";
		Cv ob1=new Cv(100,21,s1);
		ob1.details();
		String s2="Ramesh";
		Cv ob2=new Cv(101,22,s2);
		ob2.details();
		String s3="Suresh";
		Cv ob3=new Cv(103,23,s3);
		ob3.details();
		
	}

}
