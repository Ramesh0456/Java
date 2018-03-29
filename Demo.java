package superb;

public class Demo {
Demo(){
	this(5,4);
	System.out.println("Rakesh");
}
Demo(int a,int b){
	System.out.println(a+b);
}
}
  class Demo1 extends Demo
{
	Demo1(int a,int b){

		System.out.println(a+b);
	}
	Demo1()
	{
		
	this(25,45);
		System.out.println("ramesh");
	}

	public static   void main(String[] args) {
		
		// TODO Auto-generated method stub
Demo1 d=new Demo1();
	}
}

