
 abstract class A{
	
	 abstract void print();
	 void disply(){
		 System.out.println("ramesh");
	 }
	 A(){
		 System.out.println("ramesh marupakula");
	 }
 }

class B extends A{
	void print() {
		
		System.out.println("eshwar");
	}
	public static void main(String args[]){
		B b=new B();
		b.print();
		b.disply();
	}
	
}