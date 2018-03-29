public class Grepthor {
	int sno;
	int age;
	String sName;
	Grepthor(int a,int b,String c)
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
		String s1="Rakesh";
		Grepthor ob1=new Grepthor(100,21,s1);
		ob1.details();
		String s2="Ramesh";
		Grepthor ob2=new Grepthor(101,22,s2);
		ob2.details();
		String s3="Suresh";
		Grepthor ob3=new Grepthor(103,23,s3);
		ob3.details();
		
	}

}