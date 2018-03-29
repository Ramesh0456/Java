public class Riding {
	Riding(){
	
	System.out.println("ramesh");
	}
	public void print()
	{
		System.out.println("main class");
	}
}
	 class Sub extends Riding{
	public void print(){
		System.out.println("sub class");
	}
	public static void main(String[] args) {
		//Methodoverriding m=new Methodoverriding();
		Sub s=new Sub();
		s.print();
	}
	}