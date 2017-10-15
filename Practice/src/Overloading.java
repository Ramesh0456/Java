
public class Overloading{
	public void add(int a,int b)
	{
	
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
	c=a+b+c;
	System.out.println(c);
	}
public static void main(String args[]){
	Overloading o=new Overloading();
	o.add(12, 8);
	o.add(1,2,8);
}
	}
