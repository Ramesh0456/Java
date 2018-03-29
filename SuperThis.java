package practice;

public class SuperThis {
	SuperThis(){ 
		this(3,3);
		System.out.println("default parent con");
	}
	SuperThis(int a,int b){
		System.out.println(a+b);
	}
}
	class B extends SuperThis{
		B(){
			System.out.println("default sub cls ");
		}
		B(int a,int b){
			this();
			System.out.println(a*b);
		}
	
public static void main(String[] args) {
	B b=new B(2,4);
}
}